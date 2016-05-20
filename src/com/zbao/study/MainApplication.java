package com.zbao.study;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.zbao.study.bean.HelloSpring;

public class MainApplication {

	public static void main(String[] args) {
		getBean();

	}

	/**
	 * 演示通过Spring获取java对象 使用不同容器获取实体对象
	 */
	@SuppressWarnings("resource")
	private static void getBean() {
		// 这个 API 加载 beans 的配置文件并最终基于所提供的 API，它处理创建并初始化所有的对象，即在配置文件中提到的 beans。
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");
		// 这个方法使用 bean 的 ID 返回一个最终可以转换为实际对象的通用对象
		HelloSpring hello = (HelloSpring) context.getBean("hellospring");// 注意此处是beans.xml文件中定义的id
		System.out.println(hello.getMessage());

		@SuppressWarnings("deprecation")
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"Beans.xml"));
		HelloSpring bean = (HelloSpring) factory.getBean("hellospring");
		System.err.println(bean.getMessage() + "~~~~~~~~");
	}

}
