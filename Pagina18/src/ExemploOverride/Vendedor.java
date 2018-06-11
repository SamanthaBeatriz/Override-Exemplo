package ExemploOverride;

public class Vendedor extends Gerente{

	double comissao;
	void calcularSalarioFinal(double comissao){
		SalFim = SalBase + ((SalBase/100)*comissao);
		System.out.println("Salario atual:"+SalFim);
	}
	public static void main(String[] args) {
		Vendedor doing = new Vendedor();
		doing.calcularSalarioFinal(2.3);
		doing.apresentarFuncionario();

	}

}
