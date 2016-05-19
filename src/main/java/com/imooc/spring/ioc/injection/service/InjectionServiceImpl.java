package com.imooc.spring.ioc.injection.service;

import com.imooc.spring.ioc.injection.dao.InjectionDAO;

/**
 * @author	Lian
 * @time	2016年1月18日 上午1:12:54
 * @desc	
 */
public class InjectionServiceImpl implements InjectionService {
	private InjectionDAO injectionDAO;

//	public InjectionServiceImpl() {
//
//	}

	/**
	 * 构造器注入
	 * @param injectionDAO
	 */
	public InjectionServiceImpl(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	/**
	 * 设值注入
	 * @param injectionDAO
	 */
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	@Override
	public void save(String arg) {
		// 模拟业务操作
		System.out.println("Service接收参数: " + arg);
		arg = arg + ":" + this.hashCode();
		injectionDAO.save(arg);
	}
}
