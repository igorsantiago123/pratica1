package viagem;
import java.util.Scanner;

public class consumo {

	public static void main(String[] args) {
		 
		Double tempViagem, VelMedia, Distancia, ConListros, litrosPHoras;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o tempo gasto na viagem ");
		tempViagem = entrada.nextDouble();
		System.out.println("Informe a velocidade do media ");
		VelMedia = entrada.nextDouble();
		System.out.println("Informe quantos litros o autom�vel faz por horas ");
		litrosPHoras = entrada.nextDouble();
		
		Distancia = tempViagem * VelMedia;
		ConListros = Distancia/litrosPHoras;
		
		System.out.println("consumo final de combust�vel gasto e de %.2f\n" + ConListros);

	}

}
