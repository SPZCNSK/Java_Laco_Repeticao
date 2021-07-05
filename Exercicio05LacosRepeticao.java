//Juan Sapiezcinski | 05/07/21 | Ex_5_SomaNumerosDigitados(DOWHILE)

package br.com.generation.exerciciolacorepeticao;

import java.util.Scanner;

public class Exercicio05LacosRepeticao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 0, numero, somaNum = 0;
		
		do {
			i++;
			System.out.println("Digite um número: ");
			numero = entrada.nextInt();
			somaNum = somaNum + numero;
						
		}
		while(numero != 0);
		System.out.println("O total dos números digitados foi: " + somaNum);
		
		entrada.close();
	}

}
