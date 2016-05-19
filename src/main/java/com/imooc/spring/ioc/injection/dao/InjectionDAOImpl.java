package com.imooc.spring.ioc.injection.dao;

/**
 * @author	Lian
 * @time	2016年1月18日 上午1:11:54
 * @desc	
 */
public class InjectionDAOImpl implements InjectionDAO{

	@Override
	public void save(String arg) {
		// 模拟数据库保存操作
		System.out.println("保存数据: " + arg);
	}

}
