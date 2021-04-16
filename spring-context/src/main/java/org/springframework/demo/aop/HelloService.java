package org.springframework.demo.aop;

/**
 * @Author: admin
 * @Description: 目标接口
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo
 * @CreateTime: 2021-04-16 14:50:18
 */
public interface HelloService {
	void doSome(String name, Integer age);
	String doOther(String name, Integer age);
}
