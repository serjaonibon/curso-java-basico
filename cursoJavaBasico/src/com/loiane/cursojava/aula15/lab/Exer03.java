package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exer03 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma opção:");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Feminino:  F ");
		System.out.println("Masculino: M ");
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
		
		
		/*
		 
		//String entrada = scan.next().toUpperCase();
		//String entradaSexo = entrada.toUpperCase();
		
		com o swich
		 
		switch (entrada) {
		case "M": System.out.println("Você digitou |M| Masculino "); break;
		case "F": System.out.println("Você digitou |F| Masculino "); break;
		default: System.out.println("Informe um parâmetro correto!");
		}		 
		  */
		
		// com if else
		
		String entrada = scan.next();
		
		if (entrada.equalsIgnoreCase("F")) {
			System.out.println("Você digitou |F| Feminino");			
		} else if (entrada.equalsIgnoreCase("M")) {
			System.out.println("Você digitou |M| Masculino");
		} else {
			System.out.println("Digite um valor correto!");
		}
		
		

	}

}
