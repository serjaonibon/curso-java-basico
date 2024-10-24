package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número real para que possamos analisá-lo: ");
		
		double numeroReal = scan.nextDouble();
		
		if(numeroReal < 0) {
			System.out.println("O número " + numeroReal + " é NEGATIVO!");			
		} else if (numeroReal > 0) {
			System.out.println("O número " + numeroReal + " é POSITIVO" );
		} else {
			System.out.println("Digite um valor válido!");
		}
		

	}

}
