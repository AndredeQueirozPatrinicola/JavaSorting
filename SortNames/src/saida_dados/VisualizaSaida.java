package saida_dados;


public class VisualizaSaida {
    
    public static void displayInfos(String[] array){
        
        for(String nome : array){
            System.out.printf("- %s\n", nome);
        }
    }
}
