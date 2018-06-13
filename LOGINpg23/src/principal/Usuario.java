package principal;



public abstract interface Usuario {
	abstract boolean Login(String senha,String login ) ;
	

	public static void main(String[] args) {
		Funcionario people = new Funcionario();
		//people.Login("12345","SAM");
		//people.mostrar_telefone();
		//people.salBase = 1200.4;
		//people.calcularSalarioFinal(); 
		Fornecedor barn = new Fornecedor();
		//barn.mostrar_telefone();
		//barn.Login("12345","SAM");
		//barn.dados();
		Clente human = new Clente();
		//human.Login("12345", "SAM");
		//human.Calcular_limiteCred();
		//human.mostrar_telefone();
	}

	
}

