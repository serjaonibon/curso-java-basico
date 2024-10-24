package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Farenheit: ");
		double temperaturaF = scan.nextDouble();
		double temperaturaC = (5 * (temperaturaF - 32) /9);
		
		System.out.println(temperaturaF + "°F" + " equivalem a " + temperaturaC + "°C.");
		

	}

}
