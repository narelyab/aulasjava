package aula02;

import java.util.Scanner;

public class atv5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int resposta = 0;
		System.out.println("resposta com sim ou nao");
		 
		System.out.print("Telefonou para a vítima? ");
		String resposta1 = scanner.nextLine();
        if (resposta1.equalsIgnoreCase("sim")) resposta++;

        System.out.print("esteve no local do crime? ");
        String resposta2 = scanner.nextLine();
        if (resposta2.equalsIgnoreCase("sim")) resposta++;
        
        System.out.print("mora perto da vitima ? ");
        String resposta3 = scanner.nextLine();
        if (resposta3.equalsIgnoreCase("sim")) resposta++; 
        
        System.out.print("devia para a vitima  ? ");
        String resposta4 = scanner.nextLine();
        if (resposta4.equalsIgnoreCase("sim")) resposta++; 
        
        System.out.print("ja trabalhou com vitima ? ");
        String resposta5 = scanner.nextLine();
        if (resposta5.equalsIgnoreCase("sim")) resposta++;
        
        if (resposta == 2) {
            System.out.println("Classificação: Suspeita");
        } else if (resposta == 3 || resposta == 4) {
            System.out.println("Classificação: Cúmplice");
        } else if (resposta == 5) {
            System.out.println("Classificação: Assassina");
        } else {
            System.out.println("Classificação: Inocente");
        }

        scanner.close();
        
	}

}
