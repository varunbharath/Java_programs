package javaprogram;

public class EquilaterTraiagle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=5;
		for (int i = 1; i <=rows; i++) {
			for (int j = rows-i; j>0; j--) {
				System.out.print("");
				
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
