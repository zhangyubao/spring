package com.zbao.study.spring.container;

/**
 * 1.BeanFactory 和相关的接口，比如，BeanFactoryAware、
 * DisposableBean、InitializingBean，仍旧保留在 Spring 中，主要目的是向后兼容已经存在的和那些 Spring
 * 整合在一起的第三方框架。
 * 
 * 2.在 Spring 中，有大量对 BeanFactory 接口的实现。其中，最常被使用的是 XmlBeanFactory 类。这个容器从一个 XML
 * 文件中读取配置元数据，由这些元数据来生成一个被配置化的系统或者应用。
 * 
 * @author Administrator
 *
 */
public class BeanFactory {

}
