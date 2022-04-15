package escola;

public class FabricaDeAluno {
	
	private Aluno aluno;
	
	public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}
	
	public FabricaDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}
	
	public Aluno criar() {
		return this.aluno;
	}
	
	//Exemplo para instanciar novo aluno usando os métodos ao invéz de dar new
	// em cada parametro.
	
	public static void main(String[] args) {
		FabricaDeAluno fabrica = new FabricaDeAluno();
		Aluno aluno2 = fabrica.comNomeCPFEmail("", "", "")
		.comTelefone("", "")
		.comTelefone("", "")
		.criar();
	}
	
	//Criamos os métodos e encadeamos eles para não precisar instanciar na mão.

}
