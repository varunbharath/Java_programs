package javaprogram;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
int a=0;
int b=1;
Scanner x=new Scanner(System.in);
num=x.nextInt();
System.out.println("ValueofA,b;"+a+","+b);
int nextterm;
for (int i=2;i<num;i++ ) {
	nextterm =a+b;
	a=b;
	b=nextterm;
	System.out.println("nextterm values"+nextterm);
	
	
}

	}}


