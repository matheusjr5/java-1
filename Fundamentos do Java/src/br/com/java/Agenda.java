package br.com.java;

public class Agenda {

	public static void main(String[] args) {
		String [][] agenda = {{"bill gates","1111-1111", "bill@outlok.com"},{"linus torvalds", "2222-2222", "linus@gmail.com"}, {"steve jobs", "3333-3333", "steve@icloud.com"}};
		//recuperando o email do linus torvalds
		//System.out.println("email encontrado + agenda [1][2]);
		//alterando o telefone do bill gates
		agenda [0][1] = "9999-9999";
		System.out.println("alterando telefone de bill gates para: "  + agenda [0][1]);
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("_____________________________");
			for (int j = 0; j < agenda[i].length; j++) {
			System.out.println(agenda [i][j]);
		}
			
			
		}
		
	
	

	}

}
