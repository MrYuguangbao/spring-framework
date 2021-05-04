package org.springframework.demo.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Author: admin
 * @Description: 测试类1
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo.lifecycle
 * @CreateTime: 2021-05-03 16:39:18
 */
@Component
public class UserService implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, IUserService, InitializingBean{

	private User user;

	public UserService() {
		System.out.println("UserService的无参构造函数");
	}

	@Autowired
	public void setUser(User user) {
		System.out.println("populateBean阶段，先调用postProcessAfterInstantiation，再调用set方法注入");
		this.user = user;
	}

	@PostConstruct
	public void postConstr() {
		System.out.println("initializeBean阶段，先调用postProcessBeforeInitialization，再执行postConstr方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("调用afterPropertiesSet方法初始化");
	}

	@Override
	public void test() {
		System.out.println("执行业务逻辑接口的方法test");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("---BeanFactoryAware---");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("---BeanNameAware---");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("---ApplicationContextAware---");
	}

	/*@Autowired(required = false)
	public UserService(User user) {
		this.user = user;
		System.out.println("一个参数的构造函数");
	}

	@Autowired(required = false)
	public UserService(User user, Person person) {
		this.user = user;
		System.out.println("两个参数user,person的构造函数");
	}

	@Autowired(required = false)
	public UserService(User user, User user1) {
		this.user = user;
		System.out.println("两个参数user,user的构造函数");
	}*/



	/*@Autowired
	private User user;*/

	/*@Artist("Spring源码")
	private String name;

	public void print() {
		System.out.println("name:" + name);
	}*/
}
