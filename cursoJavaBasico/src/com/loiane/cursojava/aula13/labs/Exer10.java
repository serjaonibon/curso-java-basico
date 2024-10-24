package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {


Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celcius: ");
		double temperaturaC = scan.nextDouble();
		double temperaturaF = ( temperaturaC * 9/5) + 32;
		
		System.out.println(temperaturaC + "°C" + " equivalem a " + temperaturaF + " °F.");

	}

}
