package com.epam.PrasanthiGuntupalli_Calculator;
import java.util.Scanner;
public class Calculator{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a,b,n;
		boolean flag=true;
		char ch;
		Cimplement cm=new Cimplement();
		while(flag) {
			System.out.println("Enter 1st no:");
			a=sc.nextInt();
			System.out.println("Enter 2nd no:");
			b=sc.nextInt();
			System.out.println("Choose the Operation you want to do:");
			System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
			n=sc.nextInt();
			switch(n) {
				case 1:
					cm.add(a,b);
					break;
				case 2:
					cm.subtract(a,b);
					break;
				case 3:
					cm.multiply(a,b);
					break;
				case 4:
					cm.divide(a,b);
					break;
				default:
					System.out.println("Invalid input");
					
			}
			System.out.println("Do you want to perform another operation?(y/n)");
			ch=sc.next().charAt(0);
			if(ch=='y') {
				flag=true;
			}
			else {
				flag=false;
			}
		}
		System.out.println("Comeback Again");
		
	}
}