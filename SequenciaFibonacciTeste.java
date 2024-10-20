import java.util.Scanner;

public class SequenciaFibonacciTeste {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		
		int numero, a, b, c;
		
		do {
			
			System.out.print("Entre com um numero para verificar se ele pertence a sequencia de Fibonacci (Digite zero p/ Sair): ");
			
			numero = leia.nextInt();
			
			if ( numero > 0 ) {
				
				a = 0;
				b = 1;
				
				while (a < numero) {					
					
					c = a + b;
					a = b;
					b = c;
					
				}
				
				if (a == numero){
				
				System.out.println("\n\tNumero pertence à sequência de Fibonnaci");
			
			}else{
				
				System.out.println("\n\tNumero não pertence à sequência de Fibonnaci");
				
				}
			
			} else {
				
				if ( numero < 0 ) {
					
					System.out.println("\n\tQuantidade invalida! Entre com um valor positivo ou zero para sair...\n");
					
				} else {
					
					System.out.println("\n\tFim do programa!\n");
				}
			}
		
		} while ( numero != 0 );

	}
}

