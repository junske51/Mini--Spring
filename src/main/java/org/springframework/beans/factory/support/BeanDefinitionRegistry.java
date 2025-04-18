package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

//BeanDefinition注册表接口

public interface BeanDefinitionRegistry {

//向注册表中注BeanDefinition

	void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

	/**
	 根据名称查找BeanDefinition
	 BeansException 如果找不到BeanDefintion
	 */
	BeanDefinition getBeanDefinition(String beanName) throws BeansException;

// 是否包含指定名称的BeanDefinition

	boolean containsBeanDefinition(String beanName);

// 返回定义的所有bean的名称

	String[] getBeanDefinitionNames();
}
