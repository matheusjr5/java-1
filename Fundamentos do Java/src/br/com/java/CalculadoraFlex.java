package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		// variaveis 
		float abastecer,alcool,gasolina;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("");
		System.out.print("Digite o valor do álcool: ");
		alcool = teclado.nextFloat();
		System.out.print("Digite o valor da gasolina: ");
		gasolina = teclado.nextFloat();
		//processamento
		abastecer = (gasolina / alcool)  ;
		// saida
		System.out.println("Abastecer: " + abastecer);
		if (alcool < 0.7 * gasolina) { 
			System.out.println("Abasteça Alcool");
			
		} else {
			System.out.println("Abasteça Gasolina");

		}
		
		
		

	}

}
