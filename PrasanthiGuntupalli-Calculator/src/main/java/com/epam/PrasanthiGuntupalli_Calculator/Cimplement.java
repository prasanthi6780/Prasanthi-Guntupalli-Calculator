package com.epam.PrasanthiGuntupalli_Calculator;

public class Cimplement extends Calculator{
	public void add(int a,int b) {
		System.out.println("Addition of "+a+" and "+b+" is:"+(a+b));
	}
	public void subtract(int a,int b) {
		System.out.println("Subtraction of "+b+" from "+a+" is:"+(a-b));
	}
	public void multiply(int a,int b) {
		System.out.println("Product of "+a+" and "+b+" is:"+(a*b));
	}
	public void divide(int a,int b) {
		System.out.println("Division of "+a+" by "+b+" is "+(a/b));
	}
}
