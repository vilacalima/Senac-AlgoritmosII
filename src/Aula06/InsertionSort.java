package Aula06;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class InsertionSort {

	/* Criando um vetor de numeros inteiros */
	private static final Integer TAMANHO_VETOR = 100000000;
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(InsertionSort.class +  " - Ordenando aguarde...");
		
		/* Gera um vetor aleatório */
		Integer valores[] = new Integer[TAMANHO_VETOR];
		
		Random random = new Random();
		
		for (int i=0;i<=TAMANHO_VETOR-1;i++) 
			valores[i] = random.ints(1, TAMANHO_VETOR).findAny().getAsInt();
		
		/* Enviando dados para a classe para salvar o arquivo */
		GerarArquivos.gerarArquivo(valores, "entrada");

		Instant start = Instant.now();
		
		/* Faz um laço decrescente para pecorrer o vetor */
		for (int i = 0; i < valores.length; i++) {
			int j = i;
			int x = valores[j];
			while (j > 0 && x < valores[j - 1]) {
				valores[j] = valores[j - 1];
				j--;
			}
			valores[j] = x;
		}
		
		Instant end = Instant.now();
		System.out.println(InsertionSort.class + " - ##### Duração da ordenação: " + Duration.between(start, end));
		
		GerarArquivos.gerarArquivo(valores, "saida");
	}

}
