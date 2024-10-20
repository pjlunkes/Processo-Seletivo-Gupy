
public class TesteTecnicoPorcentagens {
	
	public static void main (String[] args) {
	
	//SP 			– R$67.836,43
	//RJ 			– R$36.678,66
	//MG 			– R$29.229,88
	//ES 			– R$27.165,48
	//Outros 	– R$19.849,53
	
		
		double sp, rj, mg, es, outros;
		
		double soma ;
		
		sp 	 = 67836.43; 
		rj 	 = 36678.66; 
		mg 	 = 29229.88; 
		es 	 = 27165.48; 
		outros = 19849.53; 
		
		soma = sp + rj + mg + es + outros;
		
		sp		 = (sp / soma) 	* 100;
		rj 	 = (rj / soma) 	* 100;
		mg  	 = (mg / soma) 	* 100;
		es 	 = (es / soma) 	* 100;
		outros = (outros / soma)* 100;
		
		System.out.printf("Porcentagem de SP: %.2f%%\n", sp);
		System.out.printf("Porcentagem de RJ: %.2f%%\n", rj);
		System.out.printf("Porcentagem de MG: %.2f%%\n", mg);
		System.out.printf("Porcentagem de ES: %.2f%%\n", es);
		System.out.printf("Porcentagem do outros estados: %.2f%%\n", outros);
	}
}

