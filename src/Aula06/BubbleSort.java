package Aula06;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.UUID;

public class BubbleSort {

	//Uma constante para determinar o tamanho do vetor, o que define é o final
	private static final Integer TAMANHO_VETOR = 100000000;

	public static void main(String[] args) throws IOException {
		System.out.println(BubbleSort.class + " - Ordenando aguarde...");
		Integer valores[] = new Integer[TAMANHO_VETOR];

		//Usando o Random para gerar valores aleatórios
		Random random = new Random();
		//ints entre( , ) findAny() procura qualquer valor getAsInt() devolve o numero inteiro
		for (int i = 0; i <= TAMANHO_VETOR - 1; i++)
			valores[i] = random.ints(1, TAMANHO_VETOR).findAny().getAsInt();
		
		gerarArquivo(valores, "entrada");

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

		gerarArquivo(valores, "saida");
	}

	//Metodo para gerar o arquivo, cria as entradas linha a linha
	private static void gerarArquivo(Integer valores[], String suffix) throws IOException {
		System.out.println(BubbleSort.class + " - Gravando em um arquivo");
		Path bubbleSortDiretorio = Files
				.createDirectory(Paths.get("./bubbleSortDiretorio-" + suffix + "-" + UUID.randomUUID()));
		Path bubbleSortArquivo = Files.createFile(bubbleSortDiretorio.resolve("bubbleSort-" + suffix + ".txt"));
		for (Integer valor : valores)
			Files.write(bubbleSortArquivo, (valor + "\r\n").getBytes(StandardCharsets.ISO_8859_1),
					StandardOpenOption.APPEND);
		System.out.println(BubbleSort.class + " - Arquivo gerado com sucesso");
	}

}