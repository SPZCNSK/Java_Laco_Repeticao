//Juan Sapiezcinski | 05/07/21 | Ex_6_MediaMult3(DOWHILE)

package br.com.generation.exerciciolacorepeticao;

import java.util.Scanner;

public class Exercicio06LacosRepeticao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0, i = 0, somaNum = 0, cont3 = -1;
			
		do {
			i++;
			System.out.print("Digite um n�mero qualquer (Para interromper digite 0): ");
			numero = entrada.nextInt();
			if(numero % 3 == 0) {
				somaNum = somaNum + numero;
				cont3++;
			}
			
		}
		while(numero != 0);
		System.out.println("A m�dia dos m�ltiplos de 3 �: " + (somaNum)/cont3);	
		
		entrada.close();

	}

}
