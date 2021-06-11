package com.minh89.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap so phan tu");
		int n = scanner.nextInt();
		int[] array = new int[n];
		System.out.println("nhap phan tu mang");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		
		Arrays.sort(array);
		System.out.println("mang da sap xep");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
		
		System.out.println("\nmin " + array[0]);
		
		int dem = 0;
		int tong = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 3 ==0) {
				tong += array[i];
				dem++;
			}
		}
		System.out.println("trung binh " + tong*1.0/dem);
	}

}
