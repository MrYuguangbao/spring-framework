package org.springframework.demo;


import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

import java.time.LocalDateTime;
import java.util.function.Supplier;

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

		// 声明式定义Bean
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.refresh();

		ac.registerBean(User.class, new Supplier<User>() {
			@Override
			public User get() {
				User user = new User();
				user.setName("spring");
				return user;
			}
		});

		User user = ac.getBean("user", User.class);
		System.out.println("获取属性值："+user.getName());

	}

}
