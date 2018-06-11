package ExemploOverride;

public class Gerente extends Funcionario{
	double gratificacao = 13.60;
	@Override
	void calcularSalarioFinal(){
		SalFim = SalBase + ((SalBase/100)*20) + gratificacao;
		System.out.println("Salario atual:"+SalFim);
	}

	 public void setNome(String nome) { this.Nome = nome; }
	void apresentarFuncionario() {
		System.out.println("Codigo do funcionario é:"+Codigo);
		System.out.println("Nome do funcionario é:"+Nome);
		System.out.println("O endereço é:"+Endereco);
		System.out.println("O Bairro é:"+Bairro);
		System.out.println("A cidade é:"+Cidade);
		System.out.println("O estado é:"+uf);
		
	}
	public static void main(String[] args) {
		Gerente User = new Gerente();
		User.calcularSalarioFinal();
		User.setNome("Danilo");
		User.apresentarFuncionario();

	}

}
