package javaAula;

public class Pessoa {
	String nome;
	int idade;
	double altura;
	String genero;

	public void comer(String comida) {
	System.out.println(nome+"comecou a comer"+comida);
	}
	
	public void exibirAtributos() {
		System.out.printf("nome %s idade %s altura %s genero %s",nome,idade,altura,genero);
	}
} 