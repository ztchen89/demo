package com.test.generic;

public class GenericFoo<T> 
{
	private T foo;
		
	public T getFoo() {
		return foo;
	}

	public void setFoo(T foo) {
		this.foo = foo;
	}

	public static void main(String[] args) 
	{
		GenericFoo<Boolean> foo1 = new GenericFoo<Boolean>();
		GenericFoo<Integer> foo2 = new GenericFoo<Integer>();
		
		foo1.setFoo(new Boolean(true));
		Boolean b = foo1.getFoo();
		
		foo2.setFoo(new Integer(10));
		Integer i = foo2.getFoo();
	}

}
