package org.springframework.demo;

import org.springframework.demo.circularref.B;

/**
 * @Author: admin
 * @Description: 测试循环依赖-A
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo
 * @CreateTime: 2021-04-16 10:09:23
 */
public class A {

	private org.springframework.demo.circularref.B b;

	public A() {}

	public void setB(B b) {
		this.b = b;
	}

	public void show() {
		System.out.println("调用A的show方法");
	}
}
