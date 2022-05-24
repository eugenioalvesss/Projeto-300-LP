package Exe1;
import java.util.Scanner;
                       
public class Main {

	public static void main(String[] args) {
	    Scanner ler = new Scanner(System.in);

	    int n = 10; // 
	    float v[] = new float[n]; 
	    int i; 


	    for (i=0; i<n; i++) {
	      System.out.printf("Informe a %2d° nota: ", (i+1), n);
	      v[i] = ler.nextInt();
	    }

	    float soma = 0;

	    for (i=0; i<n; i++) {
	      soma = soma + v[i];
	    }
	    System.out.printf("\nMédia = %f\n", soma/10);

	    }
	  
	  }

	
	