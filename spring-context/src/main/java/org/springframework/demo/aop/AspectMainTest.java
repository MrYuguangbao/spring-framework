package org.springframework.demo.aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * @Author: admin
 * @Description: 切面类测试
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo
 * @CreateTime: 2021-04-16 15:15:06
 */
public class AspectMainTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloService helloService = (HelloService) ac.getBean("helloService");
		String obj = helloService.doOther("aop", 5);
		System.out.println("返回结果：" + obj);
	}

}
