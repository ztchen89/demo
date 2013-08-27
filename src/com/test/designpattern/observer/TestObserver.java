package com.test.designpattern.observer;

public class TestObserver
{
	public static void main(String[] args)
	{
		//�൱��GUI��һ����ť
		Subject watched = new ConcreteSubject();
		
		//�൱�ڰ�ť���¼�������
		Observer watcher1 = new ConcreteObserver();
		Observer watcher2 = new ConcreteObserver();
		Observer watcher3 = new ConcreteObserver();
		
		//��������ע�ᵽ�����ɫ��
		watched.addWatcher(watcher1);
		watched.addWatcher(watcher2);
		watched.addWatcher(watcher3);
		
		//�ڵ�����ť�󣬴������¼�
		watched.notifyWatchers("hello");
		System.out.println("-----------");
		
		watched.removeWatcher(watcher1);
		watched.notifyWatchers("world");
	}
}
