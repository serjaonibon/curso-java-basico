package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);	
		
		
		System.out.println("Informe o primeiro número? ");
		int number1 = scan.nextInt();
		
		System.out.println("Informe o segundo número? ");
		int number2 = scan.nextInt();
		
		int sumTot = number1 + number2;
		System.out.println("A somas dos números informados é: " + sumTot );
		
				

	}

}
