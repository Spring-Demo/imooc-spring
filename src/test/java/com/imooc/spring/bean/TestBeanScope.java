package com.imooc.spring.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.spring.base.UnitTestBase;

/**
 * @author	Lian
 * @time	2016年1月18日 上午1:53:03
 * @desc	
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase {
	public TestBeanScope() {
		super("classpath*:spring-beanscope.xml");
	}

	@Test
	public void TestSay() {
		BeanScope beanScope = super.getBean("beanScope");
		beanScope.say();

		beanScope = super.getBean("beanScope");
		beanScope.say();
	}
}
