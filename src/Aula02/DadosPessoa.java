package Aula02;

import java.util.Scanner;

public class DadosPessoa {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite o nome: ");
		pessoa.setNome(input.nextLine());
		
		System.out.println("Digite a idade: ");
		pessoa.setIdade(input.nextInt());
		
		System.out.println("Digite a altura: ");
		pessoa.setAltura(input.nextDouble());
		
		System.out.println("Digite o peso: ");
		pessoa.setPeso(input.nextDouble());
		
		pessoa.andar();
		
		System.out.println(pessoa);
		
		input.close();
	}
	
}
