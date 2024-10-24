package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		System.out.println("Entre com sua idade: ");
		
		int idade = scan.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de idade!");
			
		} else {
			System.out.println("É menor de idade!");
		}
		
		*/
		
		System.out.println("Entre com o preço do item: R$ ");
		double valor = scan.nextDouble();
		
		if( valor <= 10) {
			System.out.println("Está barato, pode comprar!");
		}else if (valor > 10 && valor < 15) {
			System.out.println("Você deve pedir desconto!");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Vou cair fora, está muito caro!");
		} else {
			System.out.println("Tá querendo me roubar? ");
			
		}
		

	}

}
