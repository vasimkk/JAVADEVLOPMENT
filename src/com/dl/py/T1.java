package com.dl.py;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		float a=10000;
		System.out.println("HII VASIM,AC N0=00000000000XXXX");
		System.out.println("YOUR BAL:  "+a);
		
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER AMOUNT TO PAY RAHUL");
		float b=s.nextFloat();
		if(a>=b) {
			
			float c=a-b;
			
			System.out.println("RAHUL BAL IS:"+b);
			System.out.println("SUCCESFULLY SEND");
			System.out.println("KNOW YOUR BAL: "+c);
			
				
		}
		else {
			System.out.println("NOT AVAILABLE BAL");
			System.out.println("YOUR AVAILABLE BAL IS:"+a);
		}
		
		
		

	}

}
