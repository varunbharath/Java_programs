package javaprogram;

import javax.swing.plaf.basic.BasicPasswordFieldUI;

public class StringRevese_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="Mango";
		String word2="";//ognam
		for (int i=word.length()-1;i>0 ; i=1) {
			word2=word2+word.charAt(i);
			
			
		}
		System.out.println(word2);

	
	
	
		if(word.equals(word2)) {
			System.out.print("palindrome");
		}
		else
			System.out.print("not a palyndrome");
		
	}
}
