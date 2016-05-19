package com.imooc.spring.ioc.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.spring.base.UnitTestBase;

/**
 * @author	Lian
 * @time	2016年1月18日 上午12:51:40
 * @desc	
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestOneInterface extends UnitTestBase {
	public TestOneInterface() {
		super("classpath*:spring-ioc.xml");
	}

	@Test
	public void testHello() {
		OneInterface oneInterface = super.getBean("oneInterface");
		oneInterface.say("This is a test");
	}
}
