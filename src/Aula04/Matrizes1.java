package Aula04;

public class Matrizes1 {

	public static void main(String[] args) {

		//instanciando um vetor e atribuindo valores
		int valor[][]= {
							{0, 1, 2, 3},
							{4, 5, 6, 7},
							{8, 9, 10,11},
							{12, 13, 14, 15}
						};
		
		//Alterando atributos da matriz
		valor[0][1] = 0;
		valor[3][3] = 0;

		for(int i=0; i<=valor.length-1; i++) {
			for(int j=0; j<=valor.length-1; j++)
				System.out.println(valor[i][j]);
			System.out.println();
		}
	}

}
