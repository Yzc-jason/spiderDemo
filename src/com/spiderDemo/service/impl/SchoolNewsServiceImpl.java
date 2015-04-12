package com.spiderDemo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.spiderDemo.dao.SchoolNewsDao;
import com.spiderDemo.model.SchoolNews;
import com.spiderDemo.service.SchoolNewsService;

@Component("SchoolNewsService")
public class SchoolNewsServiceImpl implements SchoolNewsService
{

	@Resource
	private SchoolNewsDao dao;

	@Override
	public void save(SchoolNews schoolNews)
	{
		dao.save(schoolNews);
	}

}
