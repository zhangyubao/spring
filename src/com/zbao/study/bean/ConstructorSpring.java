package com.zbao.study.bean;

//当容器调用带有一组参数的类构造函数时，基于构造函数的 DI 就完成了，其中每个参数代表一个对其他类的依赖。
public class ConstructorSpring {
	/**
	 * 第一种 如果存在不止一个参数时，当把参数传递给构造函数时，可能会存在歧义。要解决这个问题，那么构造函数的参数在 bean
	 * 定义中的顺序就是把这些参数提供给适当的构造函数的顺序就可以了。
	 * 
	 * @author Administrator
	 *
	 */
	public class Bar {

	}

	public class Baz {

	}

	public class Foo {
		public Foo(Bar bar, Baz baz) {

		}
	}

	/*
	 * Beans.xml文件配置 <beans> <bean id="foo" class="x.y.Foo"> <constructor-arg
	 * ref="bar"/> <constructor-arg ref="baz"/> </bean>
	 * 
	 * <bean id="bar" class="x.y.Bar"/> <bean id="baz" class="x.y.Baz"/>
	 * </beans>
	 */

	/**
	 * 第二种 如果你使用 type 属性显式的指定了构造函数参数的类型，容器也可以使用与简单类型匹配的类型
	 */

	public class FooS {
		public FooS(int year, String name) {
			// ...
		}
	}
	
/*	<beans>

	   <bean id="exampleBean" class="examples.ExampleBean">
	      <constructor-arg type="int" value="2001"/>
	      <constructor-arg type="java.lang.String" value="Zara"/>
	   </bean>

	</beans>*/
	
	/**
	 * 最好的传递构造函数参数的方式，使用 index 属性来显式的指定构造函数参数的索引。下面是基于索引为 0 的例子
	 */
	/*
	   <bean id="exampleBean" class="examples.ExampleBean">
	      <constructor-arg index="0" value="2001"/>
	      <constructor-arg index="1" value="Zara"/>
	   </bean>

	</beans>*/
	
	/**
	 * 如果你想要向一个对象传递一个引用，你需要使用 标签的 ref 属性，如果你想要直接传递值，那么你应该使用如上所示的 value 属性
	 */
}
