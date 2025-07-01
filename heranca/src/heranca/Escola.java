package heranca;

public class Escola {

	public static void main(String[] args) {
	 Aluno A1 = new Aluno("mary" , "12345675967" , "(81)98574-3322" );
	 
	 System.out.printf(A1.nome , A1.cpf , A1.telefone );
	 
	 Professor P1 = new Professor("calvinho" , "12342678754" , "(81)95555-6666");
	 
	 System.out.printf(P1.nome , P1.cpf , P1.telefone);
	 
	 Funcionario F1 = new Funcionario("josefa" , "12345678911" , "(81)98888-7777");
	 
	 System.out.printf(F1.nome , F1.cpf , F1.telefone);
	 
	 
	 
	 
	 
	 

	 
	

	}

}
