package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a medida em metros: ");
		
		double metros = scan.nextDouble();
		
		double conversao = metros * 100;
		
		
		
		System.out.println("O resultado da conversão é: " + conversao);

	}

}
