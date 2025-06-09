package aula02;

import java.util.Scanner;

public class atv3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("digite sua primeira 1nota");
		double nota1 = input.nextDouble();
		System.out.println("digite sua primeira 2nota");
		double nota2 = input.nextDouble();
		
		 double media = (nota1 + nota2) / 2;
		 
		 System.out.println("A média é: " + media);

	        input.close();
	
		
		

	}

}
