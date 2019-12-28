package com.smarttech.shamim;

public class NewClass {

	public static void main(String[] args) {
		NewClass shamim= new NewClass();
		
		shamim.methodOne();
		
		//int x= NewClass.methodTwo();
		
		System.out.println(NewClass.methodTwo(20,4));
		
	}
	
	public void methodOne() {
		String abc = "Smarttech";
		System.out.println(abc);

	}
	public static int methodTwo(int k, int a) {
		int c= k*a;
		
		return c;
	}
}
