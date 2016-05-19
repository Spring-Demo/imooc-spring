package com.imooc.spring.ioc.injection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.spring.base.UnitTestBase;
import com.imooc.spring.ioc.injection.service.InjectionService;

/**
 * @author	Lian
 * @time	2016年1月18日 上午1:19:11
 * @desc	
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestInjection extends UnitTestBase {
	public TestInjection() {
		super("classpath*:spring-injection.xml");
	}

	@Test
	public void TestSave() {
		InjectionService injectionService = super.getBean("injectionService");
		injectionService.save("test injection");
	}
}
