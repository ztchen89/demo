package com.test.designpatten;

import java.util.ArrayList;
import java.util.List;

//具体主题角色
public class ConcreteSubject implements Subject
{
	//把所有对观察者对象的引用保存在一个集合中
	private List<Observer> list = new ArrayList<Observer>();
	
	@Override
	public void addWatcher(Observer watcher)
	{
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Observer watcher)
	{
		list.remove(watcher);
	}

	@Override
	public void notifyWatchers(String str)
	{
		for(Observer watcher : list)
		{
			watcher.update(str);
		}
	}	
}
