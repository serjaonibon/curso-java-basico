package com.loiane.cursojava.aula15.lab;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra de nosso alfabeto: ");
		String letra = scan.next();
		
		/*
		if (letra.equalsIgnoreCase("A" )) {
			System.out.println("Você digitou uma vogal.");
		} else if (letra.equalsIgnoreCase("E" ) ) {
			System.out.println("Você digitou uma vogal.");
		}else if (letra.equalsIgnoreCase("I" ) ) {
			System.out.println("Você digitou uma vogal.");
		}else if (letra.equalsIgnoreCase("O" ) ) {
			System.out.println("Você digitou uma vogal.");
		}else if (letra.equalsIgnoreCase("U" ) ) {
			System.out.println("Você digitou uma vogal.");
		} else {
			System.out.println("Você digitou uma consoante");
		}
		*/
		
		switch(letra) {
		case "a": 
		case "e": 
		case "i":
		case "o": 
		case "u":
		case "A":
		case "E": 
		case "I": 
		case "O": 
		case "U": System.out.println("Você digitou uma VOGAL!"); break;
		default: System.out.println("Você digitou uma CONSOANTE!");
		}

	}

}
