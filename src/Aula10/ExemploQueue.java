package Aula10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ExemploQueue {
	
	private static final Integer TAMANHO_LISTA = 10;
	
	public static void main(String[] args) {
		
		/* Queue uma interface do Java - 
		 * Criando uma fila de numeros interiros 
		 * LinkedList<> Uma lista ligada - onde os elementos tem ligação com o outro*/
		Queue<Integer> queue = new LinkedList<>();
		
		Random random = new Random();
		
		for (int i=0;i<=TAMANHO_LISTA-1;i++)
			/*Adiciona um elemento aleatório no final da fila*/
			queue.add(random.ints(1, TAMANHO_LISTA + 100).findAny().getAsInt());
		
		System.out.println("-------------------------");
		System.out.println("## Fila:" + queue);
		/* Vê o tamanho da fila */
		System.out.println("## Tamanho:" + queue.size());
		System.out.println("-------------------------");		

		for (int i=0;i<=TAMANHO_LISTA-1;i++) {
			/* Remove o primeiro elemento da fila */
			Integer elemento = queue.remove();
			System.out.println("-------------------------");
			System.out.println("## Elemento Removido:" + elemento);
			System.out.println("## Fila:" + queue);
			System.out.println("## Tamanho:" + queue.size());
			/* Pega o primeiro elemento da fila */
			System.out.println("## Primeiro da fila: " + queue.peek());
			System.out.println("-------------------------");			
		}
		
	}

}