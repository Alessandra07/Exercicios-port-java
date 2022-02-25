package Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int ano, mes , dia , IdadeDias;
		char nome;
		
		System.out.println(" Qual seu nome? ");
		nome = leia.next().charAt(0);
		
		System.out.println(" Qual a sua idade em dias ? ");
		IdadeDias = leia.nextInt();
		
		ano = IdadeDias/365;
		mes = (IdadeDias % 365)/30;
		dia = (IdadeDias % 365)%30;	
		
		System.out.println(nome + "Sua idade é : " + ano + "anos" + mes + "Meses" + dia + " Dias ");
		
		leia.close();
	

	}

}
