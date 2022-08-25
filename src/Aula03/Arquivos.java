package Aula03;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

public class Arquivos {

	public static void main(String[] args)  throws Exception{
		Path path = Paths.get("C:\\Users\\robson.vlima3\\workspace\\Senac\\src\\Aula03");
		System.out.println(path.toAbsolutePath());
		System.out.println("exists: " + Files.exists(path));
		
		path = Path.of("C:\\Users\\robson.vlima3\\workspace\\Senac\\src\\Aula03");
		System.out.println(path.toAbsolutePath());
		System.out.println("exists: " + Files.exists(path));
		
		path = Path.of("C:/Users/robson.vlima3/workspace/Senac/src/Aula03");
		System.out.println(path.toAbsolutePath());
		System.out.println("exists: " + Files.exists(path));
		
		path = Path.of(new URI("file:///C:/Users/robson.vlima3/workspace/Senac/src/Aula03"));
		System.out.println(path.toAbsolutePath());
		System.out.println("exists: " + Files.exists(path));
		
		FileTime fileTime = Files.getLastModifiedTime(path);
		System.out.println("lastModifiedTime: " + fileTime);
		
		UserPrincipal owner = Files.getOwner(path);
		System.out.println("owner: " + owner);
	}

}
