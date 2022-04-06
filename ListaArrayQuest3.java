package AtividadesArray;

import java.util.Scanner;

public class ListaArrayQuest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] Matriz = new int [3][3];
		int linha,coluna,valorMaior10=0;
		
			Scanner leia = new Scanner(System.in);
			System.out.println("\n...");
	
		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nInforme o valor: ");
				Matriz[linha][coluna] = leia.nextInt();
				
			if (Matriz[linha][coluna]>10);
			{ valorMaior10++;}
			
			}
			System.out.println("\nO total de valores < 10 é: "+valorMaior10);
}
 }
  }
