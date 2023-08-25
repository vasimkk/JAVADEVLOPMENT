package com.dl.basic;

import java.util.Scanner;

public class Eg11 {

	public static void main(String[] args) {
		Scanner obj= new Scanner (System.in);
		System.out.println("enter you are age");
		int age= obj.nextInt();
		if (age >=18)
		{
		System.out.println("you can vote");
		}
		else {
			System.out.println("you cannot vote");
		}
		

	}

}
