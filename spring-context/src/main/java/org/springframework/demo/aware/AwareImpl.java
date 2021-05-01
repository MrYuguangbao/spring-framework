package org.springframework.demo.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @Author: admin
 * @Description: aware测试实现类
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo.aware
 * @CreateTime: 2021-05-01 17:56:21
 */
public class AwareImpl implements BeanFactoryAware {

	private BeanFactory beanFactory;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	public void invokeAware() {
		IHello iHello = (IHello) beanFactory.getBean("iHello");
		iHello.say();
	}
}
