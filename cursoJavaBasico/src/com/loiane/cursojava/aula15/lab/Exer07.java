package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		int n1 = scan.nextInt();
		
		System.out.println("Informe o segundo número: ");
		int n2 = scan.nextInt();
		
		System.out.println("Informe o terceiro número: ");
		int n3 = scan.nextInt();
		
		if (n1 > n2 && n2 < n3) {
			System.out.println("Dos números digitados, " + n1 + " e " + n3 + " são os maiores.");
		} else if (n1 < n2 && n1 < n3) {
			System.out.println("Dos números digitados, " + n2 + " e " + n3 + " são os maiores.");
		} else if (n1 < n2 && n2 > n3) {
			System.out.println("Dos números digitados, " + n1 + " e " + n2 + " são os maiores.");
		}
		
		
		
		
		

	}

}
