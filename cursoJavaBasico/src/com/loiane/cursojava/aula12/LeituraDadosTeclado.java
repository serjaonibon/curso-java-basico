package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		 * 
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		*/
		
		/*
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		 
		 
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura);
		
		System.out.println("Digite seu apelido: ");
		String apelido = scan.next();
		System.out.println("Seu apelido: " + apelido);
		
		*/
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Informe sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Informe sua altura: ");
		float altura = scan.nextFloat();
		System.out.println("Você tem " + altura + " de altura" + "\n" + "\n");
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=");
		System.out.println("            R E S U L T A D O             ");
		System.out.println("=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=");
		System.out.println("Nome: " + nomeCompleto + "\n" +
						   "Idade: " + idade+ "\n" +
				           "Altura: "+ altura +"\n");
		
		
		
		
		

		
	
		 
		 
		 
				
	
		
		

	}

}
