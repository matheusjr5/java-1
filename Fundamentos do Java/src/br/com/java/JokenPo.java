/**
 * Atividade JokenPo	
 * @author Matheus Muniz/Kevin Cosenza
 * date 06/13/2018
 * 
 */
package br.com.java;

import java.util.Scanner;
import java.util.Random;

public class JokenPo {

	public static void main(String[] args) {
		int jogador;
		Scanner jokenpo = new Scanner(System.in);
		System.out.println("______JOKENPO________");
		System.out.println("_____________________");
		System.out.println("1.PEDRA");
		System.out.println("2.PAPEL");
		System.out.println("3.TESOURA");
		System.out.println("Digite a opção desejada :");
		jogador = jokenpo.nextInt();
		switch (jogador) {
		case 1:
			System.out.println("JOGADOR ESCOLHEU PEDRA");
			break;
		case 2:
			System.out.println("JOGADOR ESCOLHEU PAPEL");
			break;
		case 3:
			System.out.println("JOGADOR ESCOLHEU TESOURA");
		default:
			System.out.println("NENHUMA DAS OPÇÕES ACIMA INUTIL");
			break;
		}
		int computador = (int) (Math.random() * 3 + 1);
		switch (computador) {
		case 1:
			System.out.println("COMPUTADOR ESCOLHEU PEDRA");
			break;
		case 2:
			System.out.println("COMPUTADOR ESCOLHEU PAPEL");
			break;
		case 3:
			System.out.println("COMPUTADOR ESCOLHEU TESOURA");
			break;
		}

			if (jogador == computador) {
				if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
						|| (jogador == 3 && computador == 2)) {
					System.out.println("JOGADOR VENCEU");
				} else {
					System.out.println("COMPUTADOR VENCEU");
				}

			} else {
				System.out.println("EMPATE");

			}
		}

	

}