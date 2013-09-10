package com.test.aftest;

final class Enigma{
	public Enigma() {
		System.out.println(false);
		System.exit(0);
	}
}


public class Puzzlers_equals {

	public static void main(String[] args) {
		Enigma e = new Enigma();
		System.out.println(e.equals(e));
	}
}
