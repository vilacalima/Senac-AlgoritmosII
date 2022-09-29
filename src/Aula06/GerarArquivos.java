package Aula06;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.UUID;

public class GerarArquivos {

	/* Método para Gravar arquivo no diretório */
	public static void gerarArquivo(Integer valores[], String suffix) throws IOException {
		System.out.println(SelectionSort.class + " - Gravando em um arquivo" );
		Path bubbleSortDiretorio = Files.createDirectory(Paths.get("./selectionSortDiretorio-" + suffix + "-" + UUID.randomUUID()));
		Path bubbleSortArquivo = Files.createFile(bubbleSortDiretorio.resolve("selectionSortSort-" + suffix + ".txt"));
		for (Integer valor : valores)
			Files.write(bubbleSortArquivo, (valor + "\r\n").getBytes(StandardCharsets.ISO_8859_1), StandardOpenOption.APPEND);
		System.out.println(SelectionSort.class + " - Arquivo gerado com sucesso" );
	}	
}
