package com.bridgelabz;

public class perfectNumber {

	public static void main(String[] args) {
		int num =6;
		int sum =0;
		int temp =num;
		for (int i=1;i<=num/2;i++) {
			if (num%i == 0) {
				sum = sum+i;
			}
		}
if (temp == sum) {
	System.out.println("perfect Number");
} else {
	System.out.println("not perfect Number");
}
	}

}
