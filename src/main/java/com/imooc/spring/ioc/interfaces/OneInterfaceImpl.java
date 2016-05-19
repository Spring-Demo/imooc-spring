package com.imooc.spring.ioc.interfaces;

/**
 * @author	Lian
 * @time	2016年1月18日 上午12:48:25
 * @desc	接口的简单实现
 */
public class OneInterfaceImpl implements OneInterface{

	public void say(String word) {
		System.out.println("Word from interface \"OneInterface\":" + word);
	}

}
