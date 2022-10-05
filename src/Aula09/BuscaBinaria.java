package Aula09;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

import Aula06.GerarArquivos;
import Aula06.Ordernacao;

public class BuscaBinaria {

	public static void main(String[] args) throws IOException {
		Duration tempoOrdenacao = null;

		Ordernacao ordernacao = new Ordernacao();
		System.out.println("##### Gerando valores...");
		
		ordernacao.gerarValoresVetor(200000);
		
		System.out.println("##### Ordenando...");
		ordernacao.insertionSort();

		Integer valores[] = ordernacao.getValores();
		GerarArquivos.gerarArquivo(valores, "ordenado");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor para pesquisar:");
		int valor = scanner.nextInt();		

		Instant start = Instant.now();

		int posicaoInicial, metadeVetor, tamanhoVetor;
		posicaoInicial = 0;
		tamanhoVetor = valores.length - 1;
		
		/* Divide o vetor para começar a busca */
		boolean encontrou = false;
		while (posicaoInicial <= tamanhoVetor) {
			metadeVetor = (posicaoInicial + tamanhoVetor) / 2;
			
			/* Se já achar o numero procurado para */
			if (valores[metadeVetor] == valor) {
				System.out.println("##### Valor encontrado no vetor na posição " + metadeVetor);
				break;
			}

			/* Caso não vai para a direita e para a esquerda para fazer a busca */
			if (valor < valores[metadeVetor]) // esquerda
				tamanhoVetor = metadeVetor - 1;
			else // direita
				posicaoInicial = metadeVetor + 1;
		}

		if (!encontrou)
			System.out.println("##### Valor não encontrado");

		Instant end = Instant.now();
		tempoOrdenacao = Duration.between(start, end);
		System.out.println("##### Duração da pesquisa - Busca Binária: " + tempoOrdenacao);
		
		scanner.close();
	}
	
}
