//Juan Sapiezcinski | 05/07/21 | Ex_4_Pesquisa(WHILE)

package br.com.generation.exerciciolacorepeticao;

import java.util.Scanner;

public class Exercicio04LacosRepeticao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade = 0, genero, temperamento, pessoaCalma = 0, mulherNervosa = 0, 
				homemAgressivo = 0, outroCalmo = 0, nervoso40 = 0, calmo18 = 0, contador = 0;
		
		
		while(contador < 6) {// O exerc�cio pede 150, mas aqui o contador com 6 permite ver todos os casos
		contador++;					
		
		System.out.print("Qual sua idade?: ");
		idade = entrada.nextInt();
		
		System.out.print("Qual o seu genero? (1 - Homem, 2 - Mulher, 3 - N�o Bin�rio): ");
		genero = entrada.nextInt();
		
		System.out.print("Voc� se considera 1 - Calmo, 2 - Nervoso, 3 - Agressivo: ");
		temperamento = entrada.nextInt();		
		
		if(temperamento == 1) {
			pessoaCalma++;
		}
		if(genero == 2 && temperamento == 2) {
			mulherNervosa++;
		}
		if(genero == 1 && temperamento == 3) {
			homemAgressivo++;
		}
		if(genero == 3 && temperamento == 1) {
			outroCalmo++;
		}
		if(idade > 40 && temperamento == 2) {
			nervoso40++;
		}
		if(idade < 18 && temperamento == 1) {
			calmo18++;
		}		
		}		
		
		System.out.println("O n�mero de pessoas calmas �: " + pessoaCalma);
		System.out.println("O n�mero de Mulheres nervosas �: " + mulherNervosa);
		System.out.println("O n�mero de Homens agressivos �: " + homemAgressivo);
		System.out.println("O n�mero de pessoas N�o Bin�rias calmas �: " + outroCalmo);
		System.out.println("Nervoso com mais de 40: " + nervoso40);
		System.out.println("Pessoas calmas com menos de 18 anos: " + calmo18);
		
		entrada.close();
	}	
}



