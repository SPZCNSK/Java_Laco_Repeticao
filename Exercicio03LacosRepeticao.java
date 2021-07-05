//Juan Sapiezcinski | 05/07/21 | Ex_3_Idades(WHILE)


package br.com.generation.exerciciolacorepeticao;

import java.util.Scanner;

public class Exercicio03LacosRepeticao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0, mais50 = 0, menos21 = 0;
		
		while(idade != -99) {
		System.out.println("Quantos anos você tem?: ");
		idade = entrada.nextInt();
		
		if(idade > 0 && idade < 21) {
			menos21 = menos21 +1;
		}
		else if (idade > 50) {
			mais50 = mais50 + 1;
		}
		}	
		System.out.println("O total de pessoas com idades menor que 21 anos é de:" + menos21);
		System.out.println("O total de pessoas com idades maior que 50 anos é de:" + mais50);
	
		entrada.close();
	}

}
