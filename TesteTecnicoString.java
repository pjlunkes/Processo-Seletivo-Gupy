import java.util.Scanner;


public class  TesteTecnicoString {
	
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		
		String invertido = entrada.nextLine();
		
		int i = invertido.length() - 1;
		
		for(  ; i >= 0; i -- ){
			
			System.out.print("\t" + invertido.charAt(i));
			
			}
		
	}
}

