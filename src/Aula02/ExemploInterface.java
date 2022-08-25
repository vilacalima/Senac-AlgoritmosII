package Aula02;

public class ExemploInterface {

	public static void main(String[] args) {
	
		Humano pessoa = new Pessoa();
		pessoa.falar("Oi eu sou uma pessoa");
		
		Humano funcionario = new Funcionario();
		funcionario.falar("Oi eu sou um funcionario");
	}
}
