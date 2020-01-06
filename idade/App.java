package com.atividade.one.att.idade;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
    	// my age 
    	
		Scanner myAge = new Scanner(System.in);
    
		int ageOne;
    	
        System.out.println( "Digite a sua idade:" );
        ageOne = myAge.nextInt();
        
        // my mother age 
        
		int ageTwo;
    	
        System.out.println( "Digite a idade de sua mãe:" );
        ageTwo = myAge.nextInt();
        
        int sum = ageTwo - ageOne ;
        
        System.out.println("Minha mãe é "+ sum + " anos mais velha do que eu!");
        
        myAge.close();
       
    }
}
