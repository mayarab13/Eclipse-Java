package com.atividade.one.loginSenha;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
       
    	System.out.println( "Login:" );
        String logIn = scanner.nextLine();
		
		
        System.out.println( "Passworld:" );
	    int passWorld = scanner.nextInt();
	    
	    String user = "mayarab13";
	    int senha = 252510;
	    
       
	   scanner.close();
	   
	   if(logIn != user && passWorld != senha ) {
		   System.out.println("Login ou senha estão incorretos.");
	   } else {
		   System.out.println("Login efetuado com sucesso.");
	   }
   
    }
}
