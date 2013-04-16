package com.test.designpatten;

public class TestObserver
{
	public static void main(String[] args)
	{
		//相当于GUI中一个按钮
		Subject watched = new ConcreteSubject();
		
		//相当于按钮的事件监听器
		Observer watcher1 = new ConcreteObserver();
		Observer watcher2 = new ConcreteObserver();
		Observer watcher3 = new ConcreteObserver();
		
		//将监听器注册到主题角色中
		watched.addWatcher(watcher1);
		watched.addWatcher(watcher2);
		watched.addWatcher(watcher3);
		
		//在单击按钮后，触发了事件
		watched.notifyWatchers("hello");
		System.out.println("-----------");
		
		watched.removeWatcher(watcher1);
		watched.notifyWatchers("world");
	}
}
