package com.test.generic;

public class LinkedList<E>
{
	private Node head = null;
	
	private class Node{
		E value;
		Node next;
		
		Node(E value)
		{
			this.value = value;
			this.next = head;
			head = this;
		}
	}
	
	public void add(E e)
	{
		new Node(e);
	}
	
	public void dump()
	{
		for (Node n = head; n != null; n = n.next)
		{
			System.out.println(n.value + "");
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("aa");
		list.add("bb");
		list.dump();
	}
}
