package Exe11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num_inteiro1;
		int num_inteiro2;

	
		Scanner entrada = new Scanner (System.in);
				
		System.out.println("Entre com 2 números inteiros:");
		num_inteiro1 = entrada.nextInt();
		num_inteiro2 = entrada.nextInt();


		 	if ((num_inteiro1 % 2 != 0) && (num_inteiro2 % 2 != 0))  {
            System.out.println("A soma dos 2 números é: " +(num_inteiro1 + num_inteiro2) );
            
		} else if ((num_inteiro1 % 2 == 0) && (num_inteiro2 % 2 == 0))  {
             System.out.println("A multiplicação dos 2 números é: "+(num_inteiro1 * num_inteiro2) );
		
		}else if (((num_inteiro1 % 2 == 0) && (num_inteiro2 % 2 != 0)) || ((num_inteiro2 % 2 == 0) && (num_inteiro1 % 2 != 0)))
		 	{
			
            if(num_inteiro1 % 2 != 0)
            	System.out.println("Número impar = " +num_inteiro1 );
            
		  else if (num_inteiro2 % 2 != 0)
			  System.out.println("Número impar = " +num_inteiro2 );
	}
	}
		
	}



