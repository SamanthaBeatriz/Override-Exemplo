package principal;

public class Pessoa {
		int idade;
		public String Nome= "Samantha";
		 public String Codigo= "001";
		 public String Endereco= "Rua padre joao";
		 public String Bairro= "Ponte rasa";
		 public String Cidade= "São Paulo";
		 public String uf= "SP";
		 public String Telefone= "1111 2222";
		 public String celular= "9 9999 0000";
		 public String Login= "SAM";
		 public String senha= "12345";
		 public String tipoUsuario;
		 
		 public void mostrar_telefone(){
			 System.out.println("Celular:"+this.celular);
			 System.out.println("Telefone:"+this.Telefone);
		 }
		
}
