package com.spiderDemo.service;

import com.spiderDemo.model.SchoolNews;

public interface SchoolNewsService
{
	/**
	 * 把公告标题内容保存到数据库
	 */
	public void save(SchoolNews schoolNews);
}
