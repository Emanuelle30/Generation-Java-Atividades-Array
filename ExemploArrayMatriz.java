package AtividadesArray;

import java.util.Scanner;

public class ExemploArrayMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] numeros = new int [2][3];
		int somaNumeros=0, linha, coluna;
		float mediaNumeros;
		
			Scanner leia = new Scanner(System.in);
		System.out.println("\nPROGRAMA PARA CALCULAR SOMA E M�DIA USANDO ARRAY TIPO [MATRIZ]");
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com o n�mero: ");
				numeros[linha][coluna] = leia.nextInt();
				somaNumeros += numeros[linha][coluna];
			}
			mediaNumeros = somaNumeros / 6;
			System.out.printf("\nM�dia dos n�meros lidos foi: %5.2f",mediaNumeros);
		}
	}
}
