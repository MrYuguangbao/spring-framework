package org.springframework.demo;

/**
 * @Author: admin
 * @Description: 测试循环依赖-B
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo
 * @CreateTime: 2021-04-16 10:09:37
 */
public class B {

	private A a;

	public B() {
	}

	public void setA(A a) {
		this.a = a;
	}
}
