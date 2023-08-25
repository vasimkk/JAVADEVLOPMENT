package com.dl.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg10 {

	

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
		
System.out.println("enter your age");
String readline=bufferedReader.readLine();
int age=Integer.parseInt(readline);
if(age >= 18) {
	System.out.println("you can vote");
}
else {
	System.out.println("you can vote");
}
	}

}
