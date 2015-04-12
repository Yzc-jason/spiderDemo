package com.spiderDemo.dao.Impl;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spiderDemo.dao.SchoolNewsDao;
import com.spiderDemo.model.SchoolNews;

@Component("SchoolNewsDao")
public class SchoolNewsDaoImpl implements SchoolNewsDao
{

	@Resource
	private HibernateTemplate hibernateTemplate;

	@Override
	public void save(SchoolNews schoolNews)
	{
		hibernateTemplate.save(schoolNews);
	}

}
