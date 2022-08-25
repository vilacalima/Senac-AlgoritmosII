package Aula02;

public class ExemploSobrescrever {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.falar("Eu trabalho na empresa A");
		
		Pessoa pessoa = new Funcionario();
		pessoa.falar("Eu trabalho na empresa A também");
		
		Pessoa pessoaDois = new Pessoa();
		pessoaDois.falar("Eu sou uma pessoa");
	}

}
