package Aula03;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.UUID;

public class ArquivosDiretoriosEscrita {

	public static void main(String[] args) throws Exception {
		Path novoDiretorio = Files
				.createDirectory(Path.of("C:\\Users\\robson.vlima3\\Desktop/novoDiretorio-" + UUID.randomUUID()));
		System.out.println("Novo diretório:" + novoDiretorio.toAbsolutePath());

		Path novoArquivo = Files.createFile(novoDiretorio.resolve("novoArquivo.txt"));
		System.out.println("Novo arquivo:" + novoArquivo.toAbsolutePath());

		for (int i = 0; i <= 9; i++)
			Files.writeString(novoArquivo, "Valor gerado é " + UUID.randomUUID() + "\r\n", StandardCharsets.ISO_8859_1,
					StandardOpenOption.APPEND);
	}

}
