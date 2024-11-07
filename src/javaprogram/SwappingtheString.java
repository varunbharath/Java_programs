package javaprogram;

public class SwappingtheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1="Bharath";
		String S2="Kumar";
		String s=S1+S2;
		System.out.println("Before Swapping the value of the string S1+S2"+S1+S2);
		S2=s.substring(0,s.length()-S2.length());
		S1=s.substring(S2.length());
		System.out.println("AfterSwapping the value of the string S1+S2"+S1+S2);

	}

}
