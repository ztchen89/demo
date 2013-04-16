package com.test.designpatten;

//抽象主题角色
public interface Subject
{
	//注册观察者对象
	public void addWatcher(Observer watcher);
	
	//删除观察者对象
	public void removeWatcher(Observer watcher);
	
	//通知所有的观察者对象
	public void notifyWatchers(String str);
}
