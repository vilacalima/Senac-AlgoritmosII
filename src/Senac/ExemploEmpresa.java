package Senac;

public class ExemploEmpresa {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		empresa.setNome("Vilaça Tech");
		empresa.setEmail("robsonvilaca.lima@gmail.com");
		empresa.setCnpj("45.405.235/0001-26");
		empresa.setEndereco("Rua Canaã N°71");
		empresa.setramoAtividade("Desenvolvimento de sistemas");
		empresa.setSite("vilacatech.org.br");
		empresa.setTelefone("11940028922");
		
		System.out.println(empresa);
	}

}
