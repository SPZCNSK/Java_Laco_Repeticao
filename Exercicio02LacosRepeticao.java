//Juan Sapiezcinski | 05/07/21 | Ex_2_QTParImpar(FOR)

package br.com.generation.exerciciolacorepeticao;

import java.util.Scanner;

public class Exercicio02LacosRepeticao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
				
		int num, i = 0, par = 0, impar = 0;
		for(i = 0; i <10 ; i++) {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
				if(num%2 != 0) {
					impar = impar + 1;
				}
				else {
					par = par + 1;
				}
		leia.close();
		}
		System.out.println("Dos numeros digitados " + impar + " são ímpares e " + par + " são pares ");
		
		

	}

}
