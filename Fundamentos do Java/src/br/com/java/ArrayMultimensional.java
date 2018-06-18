package br.com.java;

public class ArrayMultimensional {

	public static void main(String[] args) {
		//a linha abaixo cria um array multidimensional (matriz)
		double [][] boletim = {{8,7,9,3}, {4,5,8,6}};
		//recuperando a nota de portugues do 3° bimestre
		System.out.println("Media de portugues do 3° bimestre:" + boletim [1][2]);

	}

}
