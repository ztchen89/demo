package com.test.designpattern.observer;

//���������ɫ
public interface Subject
{
	//ע��۲��߶���
	public void addWatcher(Observer watcher);
	
	//ɾ��۲��߶���
	public void removeWatcher(Observer watcher);
	
	//֪ͨ���еĹ۲��߶���
	public void notifyWatchers(String str);
}
