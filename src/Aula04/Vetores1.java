package Aula04;

public class Vetores1 {
	
	public static void main(String[] args) {
		
		//instanciando um vetor  
		int vetor[] = new int[5];
		
		//atribuindo valores na memória
		vetor[0]= 10;
		vetor[1]= 20;
		vetor[2]= 30;
		vetor[3]= 40;
		vetor[4]= 50;
		
		
		for(int i=0; i<=vetor.length-1; i++) {
			System.out.println("Valor: " + vetor[i]);
		}
	}
}
