package com.zbao.study.spring.container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 增加了企业所需要的功能，比如，从属性文件从解析文本信息和将事件传递给所指定的监听器。 ApplicationContext 包含 BeanFactory
 * 所有的功能 ,如移动设备或者基于 applet 的应用程序。
 * 
 * 最常被使用的 ApplicationContext 接口实现：
 * 
 * @author Administrator
 *
 */
public class MApplicationContext {

	// 1.FileSystemXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你需要提供给构造器
	// XML 文件的完整路径

	// 2.ClassPathXmlApplicationContext：该容器从 XML 文件中加载已被定义的 bean。在这里，你不需要提供 XML
	// 文件的完整路径，只需正确配置 CLASSPATH 环境变量即可，因为，容器会从 CLASSPATH 中搜索 bean 配置文件。

	// 3.WebXmlApplicationContext：该容器会在一个 web 应用程序的范围内加载在 XML 文件中已被定义的 bean。

	ApplicationContext context = new FileSystemXmlApplicationContext(
			"C:/Users/ZARA/workspace/HelloSpring/src/Beans.xml");
}
