package com.bridgelabz;

import java.util.Scanner;

public class subString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scn.nextLine();
		System.out.println("Enter a subString : ");
		String subString = scn.nextLine();
		if (s.contains(subString)) {
			System.out.println("it contains substring");
		} else {
			System.out.println("it does not contains substring");
		}

	}

}
