package com.zbao.study.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class AnotationSpring {

	public class Student {
		private Integer age;
		private String name;

		/**
		 * 
		 * 1. @Required这个注解的作用表示该字段一定要设置属性值 不能为空
		 */
		@Required
		public void setAge(Integer age) {
			this.age = age;
		}

		public Integer getAge() {
			return age;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}
	
	/*<?xml version="1.0" encoding="UTF-8"?>

	<beans xmlns="http://www.springframework.org/schema/beans"
	    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	    xmlns:context="http://www.springframework.org/schema/context"
	    xsi:schemaLocation="http://www.springframework.org/schema/beans
	    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
	    http://www.springframework.org/schema/context
	    http://www.springframework.org/schema/context/spring-context-3.0.xsd">

	   <context:annotation-config/>

	   <!-- Definition for student bean -->
	   <bean id="student" class="com.tutorialspoint.Student">
	      <property name="name"  value="Zara" />
	      
	      @Required age属性有此注解  所以此处一定要设置属性值 value
	      <property name="age"  value="11"/>
	   </bean>

	</beans>*/
	
	
	/**
	 * @Autowired 注释对在哪里和如何完成自动连接提供了更多的细微的控制。

	@Autowired 注释可以在 setter 方法中被用于自动连接 bean，就像 @Autowired 注释，容器，一个属性或者任意命名的可能带有多个参数的方法。

	1.Setter 方法中的 @Autowired
	你可以在 XML 文件中的 setter 方法中使用 @Autowired 注释来除去 元素。当 Spring遇到一个在 setter 方法中使用的 @Autowired 注释，它会在方法中视图执行 byType 自动连接。
	 */
	
	
	/**
	 * 	2.属性中的 @Autowired
	你可以在属性中使用 @Autowired 注释来除去 setter 方法。当时使用 为自动连接属性传递的时候，Spring 会将这些传递过来的值或者引用自动分配给那些属性。所以利用在属性中 @Autowired 的用法
	 */
	
	/**
	 * 3.构造函数中的 @Autowired
		你也可以在构造函数中使用 @Autowired。一个构造函数 @Autowired 说明当创建 bean 时，即使在 XML 文件中没有使用 元素配置 bean ，构造函数也会被自动连接
	 */
	
	/**
	 *4. @Autowired 的（required=false）选项
		默认情况下，@Autowired 注释意味着依赖是必须的，它类似于 @Required 注释，然而，你可以使用 @Autowired 的 （required=false） 选项关闭默认行为。

		即使你不为 age 属性传递任何参数，下面的示例也会成功运行，但是对于 name 属性则需要一个参数
	 */
	
	
	/**
	 *  @Qualifier 注释
		可能会有这样一种情况，当你创建多个具有相同类型的 bean 时，并且想要用一个属性只为它们其中的一个进行装配，在这种情况下，你可以使用 @Qualifier 
		注释和 @Autowired 注释通过指定哪一个真正的 bean将会被装配来消除混乱。下面显示的是使用 @Qualifier 注释的一个示例。
	 */
	public class Profile {
		   @Autowired
		   @Qualifier("student1")
		   private Student student;
		   public Profile(){
		      System.out.println("Inside Profile constructor." );
		   }
		   public void printAge() {
		      System.out.println("Age : " + student.getAge() );
		   }
		   public void printName() {
		      System.out.println("Name : " + student.getName() );
		   }
		}
	
	/**
	 * <?xml version="1.0" encoding="UTF-8"?>
		<beans xmlns="http://www.springframework.org/schema/beans"
		    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		    xmlns:context="http://www.springframework.org/schema/context"
		    xsi:schemaLocation="http://www.springframework.org/schema/beans
		    http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
		    http://www.springframework.org/schema/context
		    http://www.springframework.org/schema/context/spring-context-3.0.xsd">
		
		   <context:annotation-config/>
		
		   <!-- Definition for profile bean -->
		   <bean id="profile" class="com.tutorialspoint.Profile">
		   </bean>
		
		   <!-- Definition for student1 bean -->
		   <bean id="student1" class="com.tutorialspoint.Student">
		      <property name="name"  value="Zara" />
		      <property name="age"  value="11"/>
		   </bean>
		
		   <!-- Definition for student2 bean -->
		   <bean id="student2" class="com.tutorialspoint.Student">
		      <property name="name"  value="Nuha" />
		      <property name="age"  value="2"/>
		   </bean>
		
		</beans>
	 */
	
	/**
	 * Spring还使用基于 JSR-250 注释，它包括 @PostConstruct， @PreDestroy 和 @Resource 注释。因为你已经有了其他的选择，尽管这些注释并不是真正所需要的，但是关于它们仍然让我给出一个简短的介绍。

	@PostConstruct 和 @PreDestroy 注释：
	为了定义一个 bean 的安装和卸载，我们使用 init-method 和/或 destroy-method 参数简单的声明一下 。init-method 属性指定了一个方法，该方法在 bean 的实例化阶段会立即被调用。同样地，destroy-method 指定了一个方法，该方法只在一个 bean 从容器中删除之前被调用。

	你可以使用 @PostConstruct 注释作为初始化回调函数的一个替代，@PreDestroy 注释作为销毁回调函数的一个替代
	 */

}
