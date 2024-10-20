import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
import java.io.IOException;

public class TesteTecnicoVetor_corrigido {
    public static void main(String[] args) {

        try {
            JsonArray dados = JsonParser.parseReader(new FileReader("dados.json")).getAsJsonArray();

            double menorFat = Double.MAX_VALUE;

            double maiorFat = Double.MIN_VALUE;

            double somaFat = 0;

            int diasComFaturamento = 0;

            for (int i = 0; i < dados.size(); i++) {
                JsonObject diaObj = dados.get(i).getAsJsonObject();
                
                double faturamento = diaObj.get("valor").getAsDouble();

                if (faturamento > 0) { 
                    
                    if (faturamento < menorFat){ 
							  menorFat = faturamento;
                    }
                    
                    if (faturamento > maiorFat){ 
							
							maiorFat = faturamento;

                     somaFat += faturamento;
                     
                     diasComFaturamento++;
					  }
               }
            }

            double mediaFat = somaFat / diasComFaturamento;
            
            int diasAcimaDaMedia = 0;

            for (int i = 0; i < dados.size(); i++) {
                
                JsonObject diaObj = dados.get(i).getAsJsonObject();
                
                double faturamento = diaObj.get("valor").getAsDouble();

                if (faturamento > mediaFat) {
                    
                    diasAcimaDaMedia++;
                
                }
            }

            System.out.printf("Menor faturamento: R$ %.2f\n", menorFat);
            
            System.out.printf("Maior faturamento: R$ %.2f\n", maiorFat);
            
            System.out.printf("Média mensal: R$ %.2f\n", mediaFat);
            
            System.out.printf("Dias com faturamento acima da média: %d\n", diasAcimaDaMedia);

        } catch (IOException e) {
           
            System.out.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        
        }
    }
}
