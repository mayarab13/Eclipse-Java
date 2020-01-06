package com.atividade.one.calculadoraIdade;


import java.util.Scanner;

public class App 
{
	   public static void main( String[] args )
	   {
		   Scanner leia = new Scanner(System.in);
	   
	       System.out.print( "Digite anos: " );
	       int anos = leia.nextInt();
	       
	       System.out.print( "Digite meses: " );
	       int meses = leia.nextInt();
	       
	       System.out.print( "Digite dias: " );
	       int dias = leia.nextInt();
	       
	       int idadeMeses = (anos * 12)+ meses;
	       int totalDias = (idadeMeses * 30) + dias;
	       
	 
	       System.out.print( "Idade total em dias é: " + totalDias ); 
	       
	       leia.close();
	   }
	}