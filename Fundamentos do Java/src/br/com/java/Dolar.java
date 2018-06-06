
package br.com.java;
import java.util.Scanner;
public class Dolar {

	public static void main(String[] args) {
		double dolar,real,conversao;
		Scanner teclado = new Scanner (System.in);
		System.out.print("===================== ");
		System.out.println("TRANSFORMANDO DOLAR EM REAL ");
		System.out.println("=================== ");
		System.out.println("");
		// entrada
		System.out.print("DIGITE O VALOR DO DOLAR ; ");
		dolar = teclado.nextDouble();
		System.out.print("DIGITE O VALOR DE REAL : ");
		real = teclado.nextDouble();
		//processamento
		conversao = real*dolar;
		System.out.println(conversao);

	}

}