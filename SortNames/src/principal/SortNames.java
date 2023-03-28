package principal;

import ordenacao.OrdenaSelecao;

public class SortNames {

    
    public static void main(String[] args) {
        
        String[] data = {"B", "C", "E", "A", "DNSNA", "ddbadk", "pdpdoasd"};                
        String[] t = OrdenaSelecao.ordenaPorSelecao(data);
        
        for(String i : t){
            System.out.println(i);
        }
    }
    
}
