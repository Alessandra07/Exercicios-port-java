package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	pack

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		double segundos,horas, minutos, SegRestantes ;
		
		System.out.println("Quantos Segundos durou o evento na fábrica? ");
		segundos = leia.nextDouble();
		
		horas = segundos/3600;
		minutos = (segundos % 3600 ) / 60;
		SegRestantes = (segundos % 3600 ) % 60;
		
		System.out.println("O evento durou" + horas + " Horas: " + minutos + "Minutos" + segundos + "Segundos.");
		
		leia.close();
		
		
		
		

	}

}
