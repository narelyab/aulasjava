package Javapoo2;

public class cavalo {
	String nome;
	public cavalo() {
		
	}
	public cavalo(String nome ) {
		this.nome=nome;
	}
	public void comer() {
		System.out.println("foi comer");
	}
	public void comer(String comida) {
		System.out.printf("foi comer %s",comida);
		
	}
}
