package com.example.demo.junit;

public class ArithmeticOperation {
	public static int add(int num1,int num2){
		return num1+num2;
	}
	
	public static int sub(int num1,int num2){
		return num1-num2;
	}
	
	public static int mul(int num1,int num2){
		return num1*num2;
	}
	
	public static int div(int num1,int num2){
		return num1/num2;
	}
	
	public static boolean even1(int num1){
		return num1%2==0;
	}
	
	public static boolean isPrime(int num2){
		for(int i=2;2*i<num2;i++) {
			if(num2%i==0)
				return false;
		}
		return true;
	}
}
