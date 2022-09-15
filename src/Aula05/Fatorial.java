package Aula05;

public class Fatorial {

	public static void main(String[] args) {

		//Chama a função fatorial
		System.out.println("Valor do fatorial: " + fatorial(6));
	}
	
	public static int fatorial(int valor) {
		//Primeiro faz validação até que o valor seja = 0
		//Após empilhar começa o processo de desemplilhar fazendo o calculo do else
		if(valor==0)
			return 1;
		else {
			valor =(valor*fatorial(valor - 1));
			System.out.println(valor);
			return valor;
		}
	}
}
