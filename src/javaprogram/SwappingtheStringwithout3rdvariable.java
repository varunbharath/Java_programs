package javaprogram;

import java.util.Scanner;

public class SwappingtheStringwithout3rdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String S1;
		//String S2;
		//Scanner x=new Scanner(System.in);
		//S1=x.next();
		//S2=x.next();
	String	S1="bharath";
	String	S2="Kumar";
		System.out.println("Before swapping"+S1+S2);
		S1=S1+S2;
		System.out.println(S1);
		S2=S1.substring(0,S1.length()-S2.length());//
		S1=S1.substring(S2.length());
		System.out.println("After Swapping"+S1+S2);

	}

}
