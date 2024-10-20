
import java.util.Scanner;

public class TesteTecnicoVetor {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String meses;
		
		int dias = 0;
		
		int mediaFat = 0, diasFat = 0;
		
		double menorFat = Double.MAX_VALUE;
			
		double maiorFat = Double.MIN_VALUE;
			
		double somaFat = 0;
		
		System.out.print("Digite o mês desejado (mês completo): ");
		
		meses = entrada.nextLine().toLowerCase();
		
		switch(meses){
		 
		 	case "fevereiro":
				
				dias = 28;
				
				break;
			
			case "abril":
			case "junho":
			case "setembro":
			case "novembro":
				
				dias = 30;
				
				break;
			
			case "janeiro":
			case "março":
			case "maio":
			case "julho":
			case "agosto":
			case "outubro":
			case "dezembro":
				
				dias = 31;
				
				break;
			
			default:
				
				System.out.println("mes invalido");
			
			}
			
			double[] faturamentoDiario = new double[dias];

				for (int i = 0 ; i < dias; i++){
					
					System.out.println("Digite o valor do faturamento do dia: " + (i + 1) + "º");
					
					faturamentoDiario[i] = entrada.nextDouble();
					
					if(faturamentoDiario[i] < menorFat ){
						
						menorFat = faturamentoDiario[i];
						
						}
						
						if(faturamentoDiario[i] > maiorFat){
							
							maiorFat = faturamentoDiario[i];
							
							}
							
							if(faturamentoDiario[i] >= 0 ){
					
								somaFat += faturamentoDiario[i];
					
								}							
					}		
					
					mediaFat = (int)(somaFat/dias);
					
					for(int i = 0 ; i < dias; i++){
					
					if(faturamentoDiario[i] > mediaFat){					
						
						diasFat++;
						
						}
					}
				
					System.out.println("O valor da média mensal é: " + mediaFat);
					
					System.out.println("Menor faturamento mensal é: " + menorFat);
					
					System.out.println("Maior faturamento mensal é: " + maiorFat);
					
					System.out.println("Quantidade de dias com faturamento maior que a média mensal é: " + diasFat);					
	}
}
