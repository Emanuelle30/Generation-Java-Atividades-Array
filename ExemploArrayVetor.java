package AtividadesArray;

import java.util.Scanner;

public class ExemploArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] media = new float [3];
		float n1,n2,n3,mediaGeral,somaMedia=0;
		int x;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nPROGRAMA PARA CALCULAR MÉDIAS, UTILIZANDO ARRAY [VETOR]");
		
		for(x=0;x<3;x++)
		{
			System.out.println("\nEntre com a nota 1: ");
			n1 = leia.nextFloat();
			System.out.println("\nEntre com a nota 2: ");
			n2 = leia.nextFloat();
			System.out.println("\nEntre com a nota 3: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3) / 3;
			System.out.printf("\nMédia aritmética do aluno %d foi de: %2.2f",x+1,media[x]);
			somaMedia += media[x];
		}
			mediaGeral = somaMedia / 3;
			System.out.printf("\nA média geral da turma é: %2.2f",mediaGeral);
	}

}
