package javaprogram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=17;
		int i=2;
		boolean value=false;
		while(i<number) {
			if(number%i==0) {
				System.out.println("Not a prime number");
				value=false;
				i=i+1;
				
				
			}
			if (value==true) {
				System.out.println(" prime number");
				
			}
		}

	}

}
