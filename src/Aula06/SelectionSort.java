package Aula06;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class SelectionSort {
		
	/* Criando um vetor de numeros inteiros */
	private static final Integer TAMANHO_VETOR = 500;
		
	public static void main(String[] args) throws IOException {
		System.out.println(SelectionSort.class +  " - Ordenando aguarde..."); 
		Integer valores[] = new Integer[TAMANHO_VETOR];
		
		Random random = new Random();
		
		/* Gerando um vetor de numeros inteiros de 1 até o TAMANHO_VETOR */
		for (int i=0;i<=TAMANHO_VETOR-1;i++)
			valores[i] = random.ints(1, TAMANHO_VETOR).findAny().getAsInt();
		
		/* Gerando o arquivo dos valores de entrada */
		GerarArquivos.gerarArquivo(valores, "entrada");

		/* Inicia a busca do menor valor */
		Instant start = Instant.now();
		
		int posAtual = 0;
		int posMinimoValor = 0;
		boolean troca = false;
		for (int i=0;i<=valores.length-1;i++) {
			posAtual = i;
			posMinimoValor = i;
			troca = false;
			for (int j=i;j<=valores.length-1;j++) {
				if (valores[posMinimoValor] > valores[j]) {
					posMinimoValor = j;
					troca = true;
				}
			}
			
			/* Faz a troca do menor numero sempre a esquerda */
			if (troca) {
				int valorAtual = valores[posAtual];
				int valorMinimoValor = valores[posMinimoValor];
				
				valores[posAtual] = valorMinimoValor;
				valores[posMinimoValor] = valorAtual;
			}
		}
		
		System.out.println("");
		for (int i=0;i<=TAMANHO_VETOR-1;i++)
			System.out.println(valores[i] + " ");
		
		Instant end = Instant.now();
		System.out.println(SelectionSort.class + " - ##### Duração da ordenação: " + Duration.between(start, end));
		
		GerarArquivos.gerarArquivo(valores, "saida");
	}
	
	
}
