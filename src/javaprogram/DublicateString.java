package javaprogram;

import java.util.Iterator;

public class DublicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
		 // Original string
        String word = "Barath";
        boolean repeat = false;  // To track if a duplicate is found

        // Outer loop to pick each character
        for (int i = 0; i < word.length(); i++) {
            char check = word.charAt(i);  // Character to check for duplicates

            // Inner loop to compare with the rest of the string
            for (int j = i + 1; j < word.length(); j++) {
                if (check == word.charAt(j)) {
                    System.out.println("Duplicate character found: " + check);
                    repeat = true;
                    break;
                }
	if (repeat) {
		break;
		
	}
	if(!repeat) {
		System.out.println("not dupilcate");
	}

	}

	}}}
