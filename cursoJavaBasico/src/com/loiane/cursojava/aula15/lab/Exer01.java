package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe primeiro número? ");
		int n1 = scan.nextInt();
		
		System.out.println("Informe o segundo número? ");
		int n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println(n1 + " é maior do que " + n2 + "!");
		} else {
			System.out.println(n2 + " é maior do que " + n1 + "!");
		}
		

	}

}
