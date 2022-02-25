package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float a , b, c;
		float r , s , d ;
		
		
		System.out.println("Qual o valor de A? ");
		a = leia.nextInt();
		
		System.out.println("Qual o valor de B ? ");
		b = leia.nextInt();
		
		System.out.println("Qual o valor de C ? ");
		c = leia.nextInt();
		
		//cauculos
		
		r = (a + b) * (a + b);
		s = (b + c) * (b + c); 
		d = (r + s)/2;
		
		System.out.printf("D = %.2f" + d );
		
		leia.close();
		
		
				
		
	
	}

}
