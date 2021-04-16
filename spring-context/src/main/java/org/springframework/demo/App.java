package org.springframework.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

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
		System.out.println(SpringVersion.getVersion());
		//ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*A a = (A) ac.getBean("entityA");
		a.show();*/
		/*Hello hello = (Hello) ac.getBean("hello");
		hello.sayHello();*/
	}

}
