package Exercicios;

import java.util.Scanner;

public class Exercicio1java {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, dia, meses;
		int IdadeDias ;
		char nome;
		
		System.out.println("Qual seu nome ? ");
		nome = leia.next().charAt(0);
		
		System.out.println("Digite quantos anos você tem? ");
		anos = leia.nextInt();
		
		System.out.println("e quantos meses ? ");
		dia = leia.nextInt();
		
		System.out.println("e quantos Dias ? ");
		meses = leia.nextInt();
		
		IdadeDias = (anos * 365)+(meses * 30)+(dia);
		
		System.out.println(nome + " Sua idade em dias é : " + IdadeDias);
		
		leia.close();
		
		
		
		
		

	}

}
