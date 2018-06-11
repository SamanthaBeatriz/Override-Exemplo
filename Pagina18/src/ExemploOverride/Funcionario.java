package ExemploOverride;


public class Funcionario extends Pessoa {
	double SalBase,SalFim;
	void inserirDadosFuncionario() {
		System.out.println("Codigo do funcionario é:"+Codigo);
		System.out.println("Nome do funcionario é:"+Nome);
		System.out.println("O endereço é:"+Endereco);
		System.out.println("O Bairro é:"+Bairro);
		System.out.println("A cidade é:"+Cidade);
		System.out.println("O estado é:"+uf);
		
	} 
	@Override
	void Mostrar_Telefone(){
		System.out.println("O telefone é:"+Telefone);
		System.out.println("O celular é:"+celular);
	}
	
	void calcularSalarioFinal(){
		SalFim = SalBase + ((SalBase/100)*10);
		System.out.println("Salario atual:"+SalFim);
	}
	public static void main(String[] args) {
		Funcionario User = new Funcionario();
		User.SalBase = 500;
		User.calcularSalarioFinal();
		User.inserirDadosFuncionario();
		User.Mostrar_Telefone();
		
		
	}
}
