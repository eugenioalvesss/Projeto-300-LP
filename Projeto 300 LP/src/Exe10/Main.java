package Exe10;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ano;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um ano:");
		ano = entrada.nextInt();
		
		 if ((ano % 4 == 0 ) && (ano / 100 != 0) || (ano % 400 == 0) ) {
             System.out.println("Ano é bissexto!");
         }else{
        	 System.out.println("Ano não é bissexto!");
            
         }
         }
}
