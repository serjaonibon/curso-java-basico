package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de sua hora de trabalho? R$");
		double vlrHora = scan.nextDouble();
		
		System.out.println("Quantas horas trabalhadas por mês: ");
		double horasTrabalhadas = scan.nextDouble();
		double salario = vlrHora * horasTrabalhadas;
		double impostoRenda = salario * 0.11; // 11% imposto de renda
		double inss = salario * 0.08; // 8% inss
		double txSindicato = salario * 0.05; // 5% sindicato
		
		System.out.println("Valor pago de INSS: R$ " + inss); 
		System.out.println("Valor de imposto de renda: R$ " + impostoRenda); 
		System.out.println("Valor pago ao sindicato: R$ " + txSindicato);
		System.out.println("Valor do salário bruto: R$ " + salario);
		System.out.println("Valor total de descontos: R$ " + (impostoRenda + inss + txSindicato));
		System.out.println("Salário bruto R$ " + salario + " - INSS " + inss + 
		" - IR " + impostoRenda + " - taxa sindicato R$ " + txSindicato +
		" | salário líquido R$ " + (salario - (impostoRenda + inss + txSindicato))); 
		System.out.println(); 
		System.out.println(); 
		
		
		
		
		
		
		
		
	}

}
