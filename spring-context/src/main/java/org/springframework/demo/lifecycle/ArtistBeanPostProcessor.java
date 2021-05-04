package org.springframework.demo.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.*;

/**
 * @Author: admin
 * @Description: 自定义后置处理器
 * @BelongsProject: spring
 * @BelongsPackage: org.springframework.demo.lifecycle
 * @CreateTime: 2021-05-03 16:40:26
 */
@Component
public class ArtistBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if ("userService".equals(beanName)) {
			System.out.println("----------实例化前");
		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if ("userService".equals(beanName)) {
			System.out.println("-------------实例化后");
		}
		return true;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("userService".equals(beanName)) {
			System.out.println("-------初始化前");
			/*Method[] methods = bean.getClass().getMethods();
			for (Method method : methods) {
				if (method.isAnnotationPresent(PostConstruct.class)) {
					try {
						method.invoke(bean);
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
				}
			}*/
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		/*Class<?> clazz = bean.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(Artist.class)) {
				Artist annotation = field.getAnnotation(Artist.class);
				String value = annotation.value();
				field.setAccessible(true);
				try {
					field.set(bean, value);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}*/
		if ("userService".equals(beanName)) {
			System.out.println("-----初始化后");
			/*Object obj = Proxy.newProxyInstance(bean.getClass().getClassLoader(), bean.getClass().getInterfaces(), new InvocationHandler() {
				@Override
				public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
					System.out.println("-----代理逻辑1");
					method.invoke(bean, args);
					System.out.println("-----代理逻辑2");
					return null;
				}
			});
			return obj;*/
		}
		return bean;
	}
}
