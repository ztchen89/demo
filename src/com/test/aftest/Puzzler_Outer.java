package com.test.aftest;

import java.lang.reflect.Constructor;

public class Puzzler_Outer{
    public static void main(String[] args) throws Exception{
        new Puzzler_Outer().greetWorld();
    }
    private void greetWorld()throws Exception {
        System.out.println( Inner.class.newInstance() );
        
        //System.out.println(new Inner());
    	
        /*
        Constructor c = Inner.class.getConstructor(Puzzler_Outer.class);
    	System.out.println(c.newInstance(Puzzler_Outer.this));
    	*/
    }
    
    /*
     * 一个非静态的嵌套类的构造器，在编译时会将一个隐藏的参数作为它的第一个参数，
     * 这个参数表示了它的直接外围实例。
     * 但是上述过程只适用于普通到底构造器调用。
     * 当你适用反射调用构造器的时候，这个隐藏的参数就需要被显示的传递。
     */
    public class Inner{
    	/*
    	 * 显示的给Inner一个无参构造器也是不行的
    	public Inner()
		{
			// TODO Auto-generated constructor stub
		}
		*/
         public String toString(){
            return "Hello world";
        }
    }
}