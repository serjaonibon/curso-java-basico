package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//int nota1, nota2, nota3, nota4, media;
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Informe a quarta: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média do aluno é: " + media);
		
		

	}

}
