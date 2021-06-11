package com.minh89.lab3;

import java.util.Scanner;

public class Lab3Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nhap so luong");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] ten = new String[n];
		double [] diem = new double[n];
		System.out.println("nhap ho ten");
		for (int i = 0; i < n; i++) {
			ten[i] = sc.nextLine();
			diem[i] = sc.nextDouble();
			sc.nextLine();
		}
		for (int i = 0; i < n; i++) {
			System.out.print(ten[i] + " " + diem[i] + " ");
			if(diem[i] < 5) {
				System.out.println("yeu");
			} else if(diem[i] >= 5 && diem[i] < 6.5) {
				System.out.println("trung binh");
			}
			else if(diem[i] >= 6.5 && diem[i] < 7.5) {
				System.out.println("kha");
			} else if(diem[i] >= 7.5 && diem[i] < 9) {
				System.out.println("gioi");
			} else {
				System.out.println("xuat sac");
			}
		}
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i; i < n ; i++) {
				if(diem[i] > diem[j]) {
					double temp = diem[i];
					diem[i] = diem[j];
					diem[j] = temp;
				}
			}
		}
 	}

}
