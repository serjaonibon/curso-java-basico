package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o preço do primeiro produto: ");
		double produto1 = scan.nextDouble();
		
		System.out.println("Informe o preço do segundo produto: ");
		double produto2 = scan.nextDouble();
		
		System.out.println("Informe o preço do terceiro produto: ");
		double produto3 = scan.nextDouble();
		
		if (produto1 < produto2 && produto1 < produto3) {
			System.out.println("Produto 1 é mais barato. Pode levá-lo por R$ " + produto1);
		} else if (produto2 < produto1 && produto2 < produto3) {
			System.out.println("Produto 2 é mais barato. Pode levá-lo por R$ " + produto2);
		} else if (produto3 < produto1 && produto3 < produto2) {
			System.out.println("Produto 3 é mais barato. Pode levá-lo por R$ " + produto3);
		}		

	}

}
