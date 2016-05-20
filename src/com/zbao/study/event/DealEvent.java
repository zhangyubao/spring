package com.zbao.study.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * Spring事件处理  同时也可以自定义事件
 * @author Administrator
 *
 */
public class DealEvent {

//	Spring 的核心是 ApplicationContext，它负责管理 beans 的完整生命周期。当加载 beans 时，ApplicationContext 发布某些类型的事件。例如，当上下文启动时，ContextStartedEvent 发布，当上下文停止时，ContextStoppedEvent 发布。
//
//	通过 ApplicationEvent 类和 ApplicationListener 接口来提供在 ApplicationContext 中处理事件。如果一个 bean 实现 ApplicationListener，那么每次 ApplicationEvent 被发布到 ApplicationContext 上，那个 bean 会被通知。
//
//	Spring 提供了以下的标准事件：
//
//	序号	Spring 内置事件 & 描述
//	1	ContextRefreshedEvent	ApplicationContext 被初始化或刷新时，该事件被发布。这也可以在 ConfigurableApplicationContext 接口中使用 refresh() 方法来发生。
//
//	2	ContextStartedEvent	当使用 ConfigurableApplicationContext 接口中的 start() 方法启动 ApplicationContext 时，该事件被发布。你可以调查你的数据库，或者你可以在接受到这个事件后重启任何停止的应用程序。
//
//	3	ContextStoppedEvent当使用 ConfigurableApplicationContext 接口中的 stop() 方法停止 ApplicationContext 时，发布这个事件。你可以在接受到这个事件后做必要的清理的工作。
//
//	4	ContextClosedEvent当使用 ConfigurableApplicationContext 接口中的 close() 方法关闭 ApplicationContext 时，该事件被发布。一个已关闭的上下文到达生命周期末端；它不能被刷新或重启。
//
//	5	RequestHandledEvent	这是一个 web-specific 事件，告诉所有 bean HTTP 请求已经被服务。
	
	//示例代码
	public class EventDemo implements ApplicationListener<ContextStartedEvent>{

		@Override
		public void onApplicationEvent(ContextStartedEvent  event) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
