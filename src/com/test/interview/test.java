package com.test.interview;

//public class test {
//    private String par1;
//    private String par2;
//    test(){
//    }
//    
//    public static void main(String[] arg){
//        int a ;
////        if(a){
////            System.out.println("par1="+par1);
////        }else{
////            System.out.println("par2=" + par2);
////        }
//    }
//}

class A{
	public void printValue(){
	   System.out.print("A");
	}
	}

	class S extends A{
	public void printValue(){
	   System.out.print("S");
	}
	}

	public class test {
	public static void main(String[] args){
	   S s=new S();
	   s.printValue();
	   A as=(A)s;
	   as.printValue();
	   as=new A();
	   as.printValue();
	}
	}
