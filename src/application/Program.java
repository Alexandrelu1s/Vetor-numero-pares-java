package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantidade = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.print("Numeros pares: ");
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				quantidade++;
				System.out.print(vetor[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de pares: " + quantidade);
		
		sc.close();
	}

}
