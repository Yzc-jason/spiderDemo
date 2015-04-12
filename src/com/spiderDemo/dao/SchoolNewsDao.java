package com.spiderDemo.dao;

import com.spiderDemo.model.SchoolNews;

public interface SchoolNewsDao
{

	/**
	 * 把公告标题内容保存到数据库
	 */
	public void save(SchoolNews schoolNews);
}
