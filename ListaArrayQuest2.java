package AtividadesArray;

import java.util.Scanner;

public class ListaArrayQuest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int [] A = new int [5];
		int n,somaNumPar=0,quantNumImpar=0,numPar=0,numImpar=0;
		
			Scanner leia = new Scanner(System.in);
			
		for(n=0;n<5;n++)
		{
			System.out.println("\nInforme o número: ");
			A[n] = leia.nextInt();
			
			if (A[n] %2 == 0)
			{
				numPar = A[n];
				somaNumPar += numPar;
			}
			else
			{
				numImpar = A[n];
				quantNumImpar++;
			}
			
		}
			System.out.println("\nNúmeros pares digitados: "+numPar);
			
			System.out.println("\nA soma dos números pares digitados é: "+somaNumPar);
		
			System.out.println("\nNúmeros ímpares digitados: "+numImpar);
						
			System.out.println("\nA quantidade dos números ímpares digitados é: "+quantNumImpar);
		
		}
}