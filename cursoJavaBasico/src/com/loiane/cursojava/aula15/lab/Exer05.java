package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe a primeira nota do aluno: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informe a segunda nota do aluno: ");
		double nota2 = scan.nextDouble();		
				
		double media = (nota1 + nota2) / 2;
		
		if (media < 7 ) {
			System.out.println("Sua média foi " + media + ". Você está REPROVADO!");
		} else if (media >= 7 && media < 10) {
			System.out.println("Sua média foi " + media + ". Você está APROVADO!");
		} else if (media == 10) {
			System.out.println("Sua média foi " + media + ". Você está APROVADO com a nota MÁXIMA!");
		}
		

	}

}
