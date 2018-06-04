package br.com.java;

import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		double total, desconto,totalDesconto, ValorPago, Troco; 
		Scanner teclado = new Scanner(System.in);
		System.out.println("=====================");
		System.out.println("=====PDV======");
		System.out.println("=====================");
		System.out.println("");
		// Entrada
		System.out.print("Total: ");
		total = teclado.nextDouble();
		System.out.print("% Desconto: ");
		desconto = teclado.nextDouble();
		totalDesconto = total - ((total * desconto) / 100);
		System.out.println("Total Com Desconto: " + totalDesconto);
		System.out.println("----------------------------------");
		System.out.print("Valor pago: ");
		ValorPago = teclado.nextDouble();
		Troco = ValorPago - totalDesconto;
		System.out.println("Troco: " + Troco);
		
		
	}

}
