package org.springframework.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;

/**
 * @Author: admin
 * @Description: 测试spring ioc容器
 * @BelongsProject: spring
 * @BelongsPackage: com.ygb.demo
 * @CreateTime: 2021-04-15 16:03:11
 */
public class App {


	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Hello hello = (Hello) ac.getBean("hello");
		hello.sayHello();
	}

}
