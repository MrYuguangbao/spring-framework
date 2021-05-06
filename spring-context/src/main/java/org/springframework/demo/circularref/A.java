package org.springframework.demo.circularref;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @Author: admin
 * @Description: 测试循环依赖-A
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo
 * @CreateTime: 2021-04-16 10:09:23
 */
@Component
public class A {

	private B b;

	public A() {
		System.out.println("A的无参构造函数");
	}

	// 如果是构造器循环依赖，加上Spring的@Lazy注解可以不报错
	/*
	@Lazy
	public A(B b) {
		this.b = b;
	}
	*/

	public void setB(B b) {
		this.b = b;
	}

	public void show() {
		System.out.println("调用A的show方法");
	}
}
