package com.zbao.study.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycle {

	// 前提：你需要注册一个在 AbstractApplicationContext 类中声明的关闭 hook 的
	// registerShutdownHook() 方法。它将确保正常关闭，并且调用相关的 destroy 方法。

	// public static void main(String[] args) {
	// AbstractApplicationContext context = new
	// ClassPathXmlApplicationContext("Beans.xml");
	// HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	// obj.getMessage();
	// context.registerShutdownHook();
	// }

	/**
	 * 1.生命周期初始化、销毁在java代码中实现方式
	 * 
	 * @author Administrator
	 *
	 */

	// 初始化回调 java代码实现
	public class BeanExampleInitJava implements InitializingBean {

		@Override
		public void afterPropertiesSet() throws Exception {
			// TODO Auto-generated method stub

		}

	}

	// 销毁回调 java 代码实现
	public class BeanExampleDestroyJava implements DisposableBean {

		@Override
		public void destroy() throws Exception {
			// TODO Auto-generated method stub

		}

	}

	/**
	 * 2.生命周期初始化、销毁在xml配置中实现
	 */
	public class BeanExampleInitXml {
		// 初始化方法
		public void init() {

		}
	}

	/*
	 * 需要在Beans.xml文件中配置： <bean id="beanExampleInitXml"
	 * class="com.zbao.study.bean.BeanLifecycle.BeanExampleInitXml"
	 * destroy-method="init"/>
	 */

	public class BeanExampleDestroyXml {
		// 销毁方法
		public void destory() {

		}
	}
	/*
	 * 需要在Beans.xml文件中配置： <bean id="beanExampleDestroyXml"
	 * class="com.zbao.study.bean.BeanLifecycle.BeanExampleDestroyXml"
	 * destroy-method="destory"/>
	 */

	/**
	 * 优化：
	 * 
	 * 
	 * 默认的初始化和销毁方法 如果你有太多具有相同名称的初始化或者销毁方法的 Bean，那么你不需要在每一个 bean
	 * 上声明初始化方法和销毁方法。框架使用 元素中的 default-init-method 和 default-destroy-method
	 * 属性提供了灵活地配置这种情况，如下所示：
	 * 
	 * <beans xmlns="http://www.springframework.org/schema/beans"
	 * xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	 * xsi:schemaLocation="http://www.springframework.org/schema/beans
	 * http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
	 * 
	 * default-init-method="init" default-destroy-method="destroy">
	 * 
	 * <bean id="..." class="...">
	 * 
	 * </beans>
	 */
}
