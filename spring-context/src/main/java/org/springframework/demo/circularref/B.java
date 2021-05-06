package org.springframework.demo.circularref;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @Author: admin
 * @Description: 测试循环依赖-B
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo
 * @CreateTime: 2021-04-16 10:09:37
 */
@Component
public class B {

	private A a;

	public B() {
		System.out.println("B的无参构造函数");
	}

	/*public B(A a) {
		this.a = a;
	}*/

	public void setA(A a) {
		this.a = a;
	}
}
