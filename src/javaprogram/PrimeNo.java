package javaprogram;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Nume=17;
		int i =2;
	boolean prime	=true;
	while (i<Nume) {
		if(Nume%i==0) {
			System.out.println("Not Prime");
			prime=false;
		}
			i=i+1;
		}
	
	if(prime==true) {
		System.out.println("prime");
	}

	}

}
