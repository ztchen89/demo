package com.test.aftest;

public class TestCodeSeg {

    static
    {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    public TestCodeSeg()
    {
        System.err.println("3");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("4");
		   new TestCodeSeg();
		   //System.out.println("5");
	}

}
