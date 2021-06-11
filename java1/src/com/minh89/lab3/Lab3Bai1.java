package com.minh89.lab3;

import java.util.Scanner;

public class Lab3Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nhap N: ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean status = true;
		for (int i = 2; i < N-1; i++) {
			if(N%i == 0) {
				status = false;
				break;
			}
		}
		if(status) {
			System.out.println("N la so nguyen to");
		} else {
			System.out.println("N khong la so nguyen to");
		}
	}

}
