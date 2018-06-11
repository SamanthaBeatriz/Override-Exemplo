package ExemploOverride;

public class Temporario extends Gerente{
	
void calcularSalarioFinal(int d){
	SalFim = SalBase + ((SalBase/100)*d);
	System.out.println("Salario atual:"+SalFim);
}
	public static void main(String[] args) {
	Temporario dois = new Temporario();
	dois.apresentarFuncionario();
	dois.inserirDadosFuncionario();
	boolean comissao = false;
	if(comissao == true) {
		int d=10;
		dois.calcularSalarioFinal(d);
	}
	else {
		int d=3;
		dois.calcularSalarioFinal(d);
	}
	

	}

}
