package aula02;

import java.util.Scanner;

public class atv01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite um numero: ");
		int num1 = entrada.nextInt();
		System.out.println("digite um numero:");
		int num2 = entrada.nextInt();
		System.out.println("digite um numero: ");
		int num3 = entrada.nextInt();
		
		
		
		if(num1 > num2 && num1 > num3) { System.out.println("o numero 1 e maior ");}
		else if (num2 > num3 && num2 > num1) { System.out.println("o numero 2 e maior ");
		} else { System.out.println("o numero 3 e maior ");
	    
	    	}
	    int maior = Math.max(num1, Math.max(num2,num3));
	     System.out.println("o numero maior e :" +maior);
	  	
	}

}
