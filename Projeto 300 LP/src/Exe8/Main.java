package Exe8;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int idade; 
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade");
		idade = entrada.nextInt();
		
		if (idade < 16)  {
            System.out.println("Você não pode votar!");
            
		} else if ((idade >=16) && (idade <= 17))  {
             System.out.println("Seu voto é facultativo!");
		} else if (idade >= 65)  {
            System.out.println("Seu voto é facultativo!");
		
		} else if ((idade >=18) && (idade <= 65) || (idade >= 65))  {
            System.out.println("Seu voto é obrigatório!");
		
		 	
			
		}
	}
}

