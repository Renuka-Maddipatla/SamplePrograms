package com.bridgelabz;

public class prime {

	public static void main(String[] args) {
		int []arr = {};
		if (arr.length == 0 ) {
			System.out.println("arrays does not have any elements");
//		} else if (arr[0] == 0 || arr[1] == 1) {
//			System.out.println("0 and 1 are not prime Numbers");
		} else {
		for (int i : arr) {
			if (isPrime(i)) {
				System.out.print("prime Numbers are: " + i + " " );
			} else {
				System.out.println( i + " " + "not prime Number");
			}
		}
		}
}
	static boolean isPrime (int num) {
		
		if (num <2) return false;
		for (int i=2;i<num;i++) {
			if (num%i ==0) {
				return false;
			}
		}
		return true;
	}
}
