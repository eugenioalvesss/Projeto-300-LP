package Exe3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		  int numero = 321;
		  
	        int numeroInvertido = 0;

	        while (numero > 0) {
	            numeroInvertido = numeroInvertido *10;
	            numeroInvertido = numeroInvertido + (numero % 10);
	            numero = numero / 10;
			}
			System.out.println(numeroInvertido);
	    }
	}