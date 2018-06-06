package br.com.java;

import java.util.Scanner;

public class VerficarObrigatoriadadeVotar {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Verificar obrigatoridade de votar");
		System.out.print("Digite a sua idade: ");
		idade = teclado.nextInt();
		/* Criterios
		 * Menor que 16 anos - Proibido Votar
		 *16, 17 ou acima de 70 - voto facultativo
		 *Entre 18 e 70 - Obrigatório votar
		 */
		 if (idade < 16) {
			 System.out.println("Proibido votar");
			
		} else if (idade == 16 || idade == 17 || idade > 100){
			System.out.println("Voto Facultativo");
		} else {
			System.out.println("Voto Obrigatório");
		}
		
		
	}

  }
