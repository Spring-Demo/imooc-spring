package com.imooc.spring.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * @author	Lian
 * @time	2016年1月18日 上午12:39:58
 * @desc	测试类基类
 */
public class UnitTestBase {
	private ClassPathXmlApplicationContext context;

	private String springXmlPath;

	public UnitTestBase() {
	}

	public UnitTestBase(String springXmlPath) {
		this.springXmlPath = springXmlPath;
	}

	@Before
	public void before() {
		if (StringUtils.isEmpty(springXmlPath)) {
			springXmlPath = "classpath*:spring-*.xml";
		}
		try {
			context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}

	@After
	public void after() {
		context.destroy();
	}

	@SuppressWarnings("unchecked")
	protected <T extends Object> T getBean(String beanId) {
		try {
			return (T) context.getBean(beanId);
		} catch (BeansException e) {
			e.printStackTrace();
			return null;
		}
	}

	protected <T extends Object> T getBean(Class<T> clasz) {
		try {
			return context.getBean(clasz);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
