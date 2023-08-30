package com.dl.els;
import java.util.*;
public class E1 {

	public static void main(String[] args) {
	int u , amt=0;
	Scanner vs =new Scanner(System.in);
	System.out.println("ENTER THE UNITS");
	u=vs.nextInt();
	if(u<=100) {
		amt=u*5;
		System.out.println("BILL AMOUNT="+amt);
		
	}
	else if(u>=101 && u<=200) {
		amt=100*5+(u-100)*7;
		System.out.println("BILL AMOUNT="+amt);
	}
	else if(u>=201 && u<=300) {
			amt=100*5+200*7+(u-200)*10;
			System.out.println("BILL AMOUNT="+amt);
		}
	else  {
			amt=100*5+200*7+300*10+(u-300)*15;
			System.out.println("BILL AMOUNT="+amt);
		}


	}

}
