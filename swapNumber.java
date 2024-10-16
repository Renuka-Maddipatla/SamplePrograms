package com.bridgelabz;

import java.util.Scanner;

public class swapNumber {

	public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);
		System.out.println("Enter size of the array : ");
		int n = scn.nextInt();
		if (n<1) {
			System.out.println("Array does not have elemens: ");
		}
		int []arr = new int[n];
		System.out.println("Enter a N Numbers: ");
		for (int i =0;i<n;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("original array : ");
		printarr(arr);
		
		for (int i=0;i<n-1;i+=2) {
			arr[i] = arr[i] + arr[i+1];
			arr[i+1] = arr[i] - arr[i+1];
			arr[i] = arr[i] - arr[i+1];
		}
		System.out.println("swapped array : ");
		printarr(arr);
	}
		 static void printarr (int []arr) {
			for (int num : arr) {
				System.out.print( num + " ");
			}
			System.out.println();
		}
	}


