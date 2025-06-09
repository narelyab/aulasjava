package aula02;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		System.out.println(" digite F ou M ");
		char letra = imput.next().charAt(0);
		System.out.println(letra=='f'?"femenuni":letra=='m'?"masculino":"nulo");
		imput.close();

		  

	}

}
