package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Por gentileza, informe um número? ");
		
		int numero = scan.nextInt();
		
		System.out.println("O número informado foi " + numero + "!");

	}

}
