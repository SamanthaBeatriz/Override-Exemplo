package principal;

public class Fornecedor extends Pessoa{
	public String cnpj = "05364-7813-2";
	public String ie = "4851395-abc";
	public String contato = "4444-5555";
	boolean test;
	
	public void dados() {
		System.out.println("CNPJ ="+cnpj);
		System.out.println("IE ="+ie);
	}
	@Override
	public
	void mostrar_telefone() {
		 System.out.println("Celular do Fornecedor:"+this.celular+"\n"
				 +"Telefone do Fornecedor:"+this.contato);
	}
	boolean Login(String senha,String login) {
		if (senha == this.senha ) {
			System.out.println("Fornecedor Valido");
			return test=true;
			
		}
		else {
			System.out.println("Fornecedor NAO Valido");
			return test=false;
		}
		
	}

}
