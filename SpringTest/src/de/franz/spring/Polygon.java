package de.franz.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class Polygon implements ApplicationContextAware, BeanNameAware, DisposableBean, InitializingBean, Shape {

	private ApplicationContext context = null;
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;	
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println(beanName);
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean inti Method has been called for Triangle");	
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean destroy Method has been called for Triangle");	
	}
	
}
