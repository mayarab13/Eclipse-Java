package com.atividade.one.qntEstoque;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
		Scanner scanner = new Scanner(System.in);
    
		int maxima;
    	
        System.out.println( "Digite a quantidade maxima:" );
        maxima = scanner.nextInt();
        
        
        
		int minima;
    	
        System.out.println( "Digite a quantidade minima" );
        minima = scanner.nextInt();
        
        int soma = ((minima + maxima)/2);
        
        System.out.println("Estoque medio = " + soma );
        
        scanner.close();
       
    }
}