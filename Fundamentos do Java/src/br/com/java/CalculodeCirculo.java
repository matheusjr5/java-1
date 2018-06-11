package br.com.java;
import java.util.Scanner;
public class CalculodeCirculo {

	public static void main(String[] args) {
		double area,raio, pi;
		Scanner teclado = new Scanner(System.in);
		System.out.println("===================== ");
		System.out.println("Calculo da circuferencia");
		System.out.println("=====================");
		System.out.println("");
		//entrada
		System.out.println("AREA : ");
		area = teclado.nextDouble();
		System.out.println("RAIO ; ");
		raio = teclado.nextDouble();
		//processamento
		pi= 3.14*raio*raio;
		//saida
		System.out.println("espaço da aréa: " + pi );
		
		
		
		

	}

}
