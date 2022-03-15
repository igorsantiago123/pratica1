package OperadoraArea;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int Op, i;
		String Nome, ln1, ln3, ln2, ln4;
		
		for(i=0;i<=3;i++){
					System.out.println("* * * * * * * * * * * * * * * * * *");
					System.out.println("* Escolha uma das opções abaixo   *");
	      			System.out.println("* Opção 1 - Cadastrar Passageiros *");
	          			System.out.println("* Opção 2 - Check in              *");
	          			System.out.println("* Opção 3 - Cancelar Voo          *");
	          			System.out.println("* Opção 4 -  Sair                 *");
	          			System.out.println("*                                 *");
	          			System.out.println("* * * * * * * * * * * * * * * * * *");
	          Op=entrada.nextInt();
	         
	        	  switch(Op) {
	          		case 1:
	        	   
	          			System.out.println("Informe o Nome:" + "\n" + "CPF:" + "\n" + "Data do voo:" + "\n" +"Horário do voo:");
	          			Nome=entrada.next();
	          			ln1=entrada.next();
	          			ln2=entrada.next();
	          			ln3=entrada.next();
	          			System.out.println("Cadastro Efetuado com Sucesso");
	        	  	
	          			break;
	          		case 2:
	          			System.out.println("Informe numero do CPF:" + "\n" + "Numero do Voo:");
	          			ln1=entrada.next();
	          			ln4=entrada.next();
	          			System.out.println("Check in realizado com sucesso.");
	        	  	
	          			break;
	          		case 3:
	          			System.out.println("Informe numero do CPF:" + "\n" + "Numero do Voo:");
	          			ln1=entrada.next();
	          			ln4=entrada.next();
	          			System.out.println("Voo Cancelado com sucesso.");
	        	  	
	          			break;
	          		case 4:
	          			System.out.println("Operação Finalizada");
	        	  	
	          			break;
	          		default:
	          			System.out.println("Opção Invalido");
	        	  	
	          			break;
	          	}
	        }
	}
			
}