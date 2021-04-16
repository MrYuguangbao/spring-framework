package org.springframework.demo.aop;

/**
 * @Author: admin
 * @Description:
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo
 * @CreateTime: 2021-04-16 14:51:23
 */
public class HelloServiceImpl implements HelloService {


	@Override
	public void doSome(String name, Integer age) {
		System.out.println("目标方法执行doSome");
	}

	@Override
	public String doOther(String name, Integer age) {
		System.out.println("目标方法执行doOther");
		return name;
	}
}
