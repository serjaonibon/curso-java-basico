package cursoJavaBasico;

public class Erro01 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 8;
		int n3 = (n1 + n2) / 2;
		if (n3 >= 6) {
			System.out.println("Sua primeira nota foi: " + n1 + "\n" +
			"Sua segunda nota foi: " + n2 + '\n' +
			"Sua média é: " + n3 + " -> Parabéns, você está APROVADO!");			
		} else {
			System.out.println("Sua primeira nota foi: " + n1 + "\n" +
					"Sua segunda nota foi: " + n2 + '\n' +
					"Sua média é: " + n3 + " Que pena, você está REPROVADO!");		
		}
				
		

	}

}
