package ordenacao;


public class OrdenaSelecao {
    
    public static String[] ordenaPorSelecao(String[] data){
        
        for(int i = 0;i < data.length - 1; i++){
            int min = i;
            for(int j = (i + 1); j < data.length;j++){       
                if ( data[j].compareToIgnoreCase( data[min] ) < 0 ){
                    min = j;
                }
            }
            if(data[i] != data[min]){
               String aux = data[i];
                data[i] = data[min];
                data[min] = aux; 
            }
            
        }
        return data;
        
    }
    
}
