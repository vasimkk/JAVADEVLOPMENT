package com.dl.basic;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
	
		for( int i=1; i<=10; i++) {
			System.out.println("loop=" +i);
		}
		System.out.println("repeat");
		for( int i=10; i >=1; i--) {
			System.out.println("loop="+i);
		}
		// user get input by scanner class
		Scanner a=new Scanner(System.in);
		System.out.println("enter the no");
		int b=a.nextInt();
		for(System.out.println(b); b<=10; b++) {
			System.out.println(b);
			
		}

	}

}
