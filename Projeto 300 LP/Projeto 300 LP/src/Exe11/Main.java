package Exe11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num_inteiro1;
		int num_inteiro2;

	
		Scanner entrada = new Scanner (System.in);
				
		System.out.println("Entre com 2 n�meros inteiros:");
		num_inteiro1 = entrada.nextInt();
		num_inteiro2 = entrada.nextInt();


		 	if ((num_inteiro1 % 2 != 0) && (num_inteiro2 % 2 != 0))  {
            System.out.println("A soma dos 2 n�meros �: " +(num_inteiro1 + num_inteiro2) );
            
		} else if ((num_inteiro1 % 2 == 0) && (num_inteiro2 % 2 == 0))  {
             System.out.println("A multiplica��o dos 2 n�meros �: "+(num_inteiro1 * num_inteiro2) );
		
		}else if (((num_inteiro1 % 2 == 0) && (num_inteiro2 % 2 != 0)) || ((num_inteiro2 % 2 == 0) && (num_inteiro1 % 2 != 0)))
		 	{
			
            if(num_inteiro1 % 2 != 0)
            	System.out.println("N�mero impar = " +num_inteiro1 );
            
		  else if (num_inteiro2 % 2 != 0)
			  System.out.println("N�mero impar = " +num_inteiro2 );
	}
	}
		
	}



