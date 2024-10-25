package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		int n1 = scan.nextInt();
		System.out.println("Entre com o segundo número: ");
		int n2 = scan.nextInt();
		System.out.println("Entre com o terceiro número: ");
		int n3 = scan.nextInt();
		
		if (n1 > n2 && n1 > n3 ) {
			System.out.println("N1 -> " + n1 + " é o maior.");
		} else if(n2 > n1 && n2 > n3) {
			System.out.println("N2 -> " + n2 + " é o maior.");			
		} else if (n3 > n1 && n3 > n2) {
			System.out.println("N3 -> " + n3 + " é o maior.");
		}
		
		if (n1 < n2 && n1 < n3 ) {
			System.out.println("N1 -> " + n1 + " é o menor.");
		} else if(n2 < n1 && n2 < n3) {
			System.out.println("N2 -> " + n2 + " é o menor.");			
		} else if (n3 < n1 && n3 < n2) {
			System.out.println("N3 -> " + n3 + " é o menor.");
		}		

	}

}
	
	
