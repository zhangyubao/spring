package com.zbao.study.bean;

public class BeanScope {

	/*
	 * 1.singleton作用域： 如果作用域设置为 singleton，那么 Spring IoC 容器刚好创建一个由该 bean
	 * 定义的对象的实例。该单一实例将存储在这种单例 bean 的高速缓存中，以及针对该 bean 的所有后续的请求和引用都返回缓存对象。
	 * 
	 * 默认作用域是始终是 singleton，但是当仅仅需要 bean 的一个实例时，你可以在 bean 的配置文件中设置作用域的属性为
	 * singleton，如下所示：
	 * 
	 * <!-- A bean definition with singleton scope --> <bean id="..."
	 * class="..." scope="singleton"> <!-- collaborators and configuration for
	 * this bean go here --> </bean>
	 */

	/*
	 * 2.prototype作用域: 如果作用域设置为 prototype，那么每次特定的 bean 发出请求时 Spring IoC
	 * 容器就创建对象的新的 Bean 实例。一般说来，满状态的 bean 使用 prototype 作用域和没有状态的 bean 使用
	 * singleton 作用域。
	 * 
	 * 为了定义 prototype 作用域，你可以在 bean 的配置文件中设置作用域的属性为 prototype，如下所示：
	 * 
	 * <!-- A bean definition with singleton scope --> <bean id="..."
	 * class="..." scope="prototype"> <!-- collaborators and configuration for
	 * this bean go here --> </bean>
	 */

}
