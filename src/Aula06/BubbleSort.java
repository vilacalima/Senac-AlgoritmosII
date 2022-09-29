package Aula06;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class BubbleSort {

	//Uma constante para determinar o tamanho do vetor, o que define é o final
	private static final Integer TAMANHO_VETOR = 500;

	public static void main(String[] args) throws IOException {
		System.out.println(BubbleSort.class + " - Ordenando aguarde...");
		Integer valores[] = new Integer[TAMANHO_VETOR];

		//Usando o Random para gerar valores aleatórios
		Random random = new Random();
		//ints entre( , ) findAny() procura qualquer valor getAsInt() devolve o numero inteiro
		for (int i = 0; i <= TAMANHO_VETOR - 1; i++)
			valores[i] = random.ints(1, TAMANHO_VETOR).findAny().getAsInt();
		
		GerarArquivos.gerarArquivo(valores, "entrada");

		//Instant.now retorna a data hora minutos e segundos
		Instant start = Instant.now();

		int aux = 0;
		//Percorre o vetor
		for (int i = 0; i < valores.length - 1; i++) {
			//Faz a troca dos valores coloca o -i pra ele só ir aonde não foi ordenado ainda
			// -1 não estoura o indice e dar erro de exception
			for (int j = 0; j < valores.length - i - 1; j++) {
				if (valores[j] > valores[j + 1]) {
					aux = valores[j];
					valores[j] = valores[j + 1];
					valores[j + 1] = aux;
				}
			}
		}

		Instant end = Instant.now();
		System.out.println(BubbleSort.class + " - ##### Duração da ordenação: " + Duration.between(start, end));

		GerarArquivos.gerarArquivo(valores, "saida");
	}

}