package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o valor da hora trabalhada? R$ ");
		double vlrHora = scan.nextDouble();
		
		System.out.println("Quantas horas foram trabalhadas: ");
		double hrTrabalhada = scan.nextDouble();
		
		double pgto =  vlrHora * hrTrabalhada;
		
		System.out.println("Você receberá o valor de R$ " + pgto + ", por suas horas trabalhadas esse mês.");
		
		

	}

}
