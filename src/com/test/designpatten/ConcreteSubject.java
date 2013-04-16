package com.test.designpatten;

import java.util.ArrayList;
import java.util.List;

//���������ɫ
public class ConcreteSubject implements Subject
{
	//�����жԹ۲��߶�������ñ�����һ��������
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
