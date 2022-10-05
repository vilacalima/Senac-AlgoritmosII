package Aula09;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

import Aula06.Ordernacao;
import Aula06.GerarArquivos;


public class BuscaLinear {

	public static void main(String[] args) throws IOException {
		Duration tempoOrdenacao = null;

		Ordernacao ordernacao = new Ordernacao();
		System.out.println("##### Gerando valores...");
		
		ordernacao.gerarValoresVetor(200000);
		
		/* Ordenando o vetor com um insertionSort */
		System.out.println("##### Ordenando...");
		ordernacao.insertionSort();

		Integer valores[] = ordernacao.getValores();
		GerarArquivos.gerarArquivo(valores, "ordenado");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor para pesquisar:");
		int valor = scanner.nextInt();

		Instant start = Instant.now();

		/* Nesse percorremos o vetor, temos um if e um flag(variável booleana), e damos um break para interromper */
		boolean encontrou = false;
		for (int i = 0; i <= valores.length - 1; i++) {
			if (valor == valores[i]) {
				encontrou = true;
				System.out.println("##### Valor encontrado no vetor na posição " + i);
				break;
			}
		}

		if (!encontrou)
			System.out.println("##### Valor não encontrado");

		Instant end = Instant.now();
		tempoOrdenacao = Duration.between(start, end);
		System.out.println("##### Duração da pesquisa - Busca Linear: " + tempoOrdenacao);
		
		scanner.close();
	}
	
	

}