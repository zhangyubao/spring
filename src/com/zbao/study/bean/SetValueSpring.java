package com.zbao.study.bean;

public class SetValueSpring {

	// 你应该注意定义在基于构造函数注入和基于设值函数注入中的 Beans.xml 文件的区别。唯一的区别就是在基于构造函数注入中，我们使用的是index标签中的
	// 元素，而在基于设值函数的注入中，我们使用的是 name标签中的 元素。

	// 第二个你需要注意的点是，如果你要把一个引用传递给一个对象，那么你需要使用 标签的 ref 属性，而如果你要直接传递一个值，那么你应该使用
	// value 属性。
	
	
	/*如果你有许多的设值函数方法，那么在 XML 配置文件中使用 p-namespace 是非常方便的。让我们查看一下区别：

	以带有 标签的标准 XML 配置文件为例：

	<?xml version="1.0" encoding="UTF-8"?>

	<beans xmlns="http://www.springframework.org/schema/beans"
	    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	    xsi:schemaLocation="http://www.springframework.org/schema/beans
	    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

	   <bean id="john-classic" class="com.example.Person">
	      <property name="name" value="John Doe"/>
	      <property name="spouse" ref="jane"/>
	   </bean>

	   <bean name="jane" class="com.example.Person">
	      <property name="name" value="John Doe"/>
	   </bean>

	</beans>
	上述 XML 配置文件可以使用 p-namespace 以一种更简洁的方式重写，如下所示：

	<?xml version="1.0" encoding="UTF-8"?>

	<beans xmlns="http://www.springframework.org/schema/beans"
	    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	    xmlns:p="http://www.springframework.org/schema/p"
	    xsi:schemaLocation="http://www.springframework.org/schema/beans
	    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">

	   <bean id="john-classic" class="com.example.Person"
	      p:name="John Doe"
	      p:spouse-ref="jane"/>
	   </bean>

	   <bean name="jane" class="com.example.Person"
	      p:name="John Doe"/>
	   </bean>

	</beans>
	在这里，你不应该区别指定原始值和带有 p-namespace 的对象引用。-ref 部分表明这不是一个直接的值，而是对另一个 bean 的引用。*/
}
