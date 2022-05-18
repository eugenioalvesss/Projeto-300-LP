package Exe11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num_inteiro1;
		int num_inteiro2;
		int total_soma = num_inteiro1 + num_inteiro2;
		int total_produto = num_inteiro1 * num_inteiro2;
	
		Scanner entrada = new Scanner (System.in);
				
		System.out.println("Entre com 2 números inteiros:");
		num_inteiro1 = entrada.nextInt();
		num_inteiro2 = entrada.nextInt();


		 if ((num_inteiro1 / 2 != 0) && (num_inteiro2 / 2 != 0))  {
            System.out.println("Soma dos 2 números: " num_inteiro1 + num_inteiro2 );
            
		} else if ((num_inteiro1 / 2 == 0) && (num_inteiro2 / 2 == 0))  {
             System.out.println("Soma dos 2 números: "+total_produto );
        
		}else{
       	 System.out.println("Ano não é bissexto!");
           
		
		System.out.println("");
		
	}

}
}
