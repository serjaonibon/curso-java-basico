package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro inteiro número: ");
		int n1 = scan.nextInt();
		
		System.out.println("Informe o segundo inteiro número: ");
		int n2 = scan.nextInt();
		
		System.out.println("Informe o primeiro real número: ");
		double n3 = scan.nextDouble();
		
		double calc1 = (n1 * 2) * (n2 / 2);
		double calc2 = (n1 * 3) + n3;
		double calc3 = Math.pow(n3, 3);
		
		System.out.println("O cálculo da opção a: " + calc1);
		System.out.println("O cálculo da opção b: " + calc2);
		System.out.println("O cálculo da opção c: " + calc3);
		


		

	}

}
