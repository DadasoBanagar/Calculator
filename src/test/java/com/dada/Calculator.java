package com.dada;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number");
		int number1=sc.nextInt();
		
		System.out.println("Enter your second number number");
		int number2=sc.nextInt();
		
		System.out.println("Addition of two number"+(number1+number2));
		System.out.println("Substraction of two number"+(number1-number2));
		System.out.println("Multiplication of two number"+(number1*number2));
		System.out.println("Division of two number"+(number1/number2));
		
	}

}
