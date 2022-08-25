package Aula02;

public class ExemploPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Robson Vilaça");
		pessoa.setIdade(25);
		pessoa.setAltura(1.75);
		pessoa.setPeso(60.0);
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getIdade());
		System.out.println(pessoa.getAltura());
		System.out.println(pessoa.getPeso());
		
		System.out.println(pessoa.andar());

	}

}
