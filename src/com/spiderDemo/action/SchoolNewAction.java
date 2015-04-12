package com.spiderDemo.action;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.spiderDemo.model.SchoolNews;
import com.spiderDemo.service.SchoolNewsService;

@Controller("SchoolNewAction")
public class SchoolNewAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Resource(name = "SchoolNewsService")
	private SchoolNewsService schoolNewsService;

	public String spiderNews() throws IOException
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		String url = request.getParameter("url");
		String start = request.getParameter("start");
		Integer startPage = Integer.valueOf(start);
		String stop = request.getParameter("stop");
		Integer end = Integer.valueOf(stop);

		for (int i = startPage; i <= end; i++)
		{
			String page = String.valueOf(i);
			String newUrl = url + "?Page=" + page;
			Document doc = Jsoup.connect(newUrl).get();
			Elements table = doc.select("table[width=95%]").select("tr");

			for (int j = 0; j < table.size(); j++)
			{
				String title = table.select("td[width=72%]").get(j).text()
						.replace("◎ ", "");
				String date = table.select("td[width=28%]").get(j).text()
						.replace("◎ ", "");
				SchoolNews news = new SchoolNews();
				news.setTitle(title);
				news.setCreateTime(date);
				schoolNewsService.save(news);
			}
		}
		return "success";

	}

}
