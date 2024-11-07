package javaprogram;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,8,7,6,5,2,2};
		for (int i = 0; i < a.length; i++) {
			for (int j =i+ 1; j < a.length; j++) {
				if(a[i]==a[j]) {
				System.out.print("a value is"+a[i]);
				break;
				}
			}
			
		}
		

	}

}
