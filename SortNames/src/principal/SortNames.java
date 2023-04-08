package principal;

import java.util.Scanner;
import ordenacao.OrdenaSelecao;
import saida_dados.VisualizaSaida;
import ordenacao.OrdenaSelecao;

public class SortNames {

    
    public static void main(String[] args) {
        String[] array;
        
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o tamanho do array:");
                int arrLen = sc.nextInt();
                array = new String[arrLen];
                break;
            }
            catch(Exception e){
                System.out.println("Tamanho inválido! Insira um número inteiro para continuar");
            }
        }
        
        while(true){
            menu();
            int opcao = pegaOpcao();
            
            switch(opcao){
                case 1: 
                    array = cadastraNomes(array);
                    break;
                case 2:
                    VisualizaSaida.displayInfos(array);
                    break;
                case 3:
                    OrdenaSelecao.ordenaPorSelecao(array);
                    break;
                case 4:
                    apagaNomes(array);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Favor escolher uma das 5 opções");
            }
        }
    }
    
    public static void menu(){
        System.out.println("Escolha uma das opções");
        System.out.println("1 - Cadastrar nomes");
        System.out.println("2 - Vizualizar nomes");
        System.out.println("3 - Ordenar nomes");
        System.out.println("4 - Apaga nomes");
        System.out.println("5 - Sair");
    }

    public static String[] cadastraNomes(String[] array) {
    
        int x = 0;
        while(x < array.length){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.printf("Coloque o %dº nome do array \n", x+1);
                String number = sc.nextLine();
                array[x] = number;
                x++;
            }
            catch(Exception e)
            {
                System.out.println("Entrada inválida!! Certifique-se de colocar um valor válido");
            }            
        }
        return array;
    }
    
    public static int pegaOpcao(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a opção:");
            int opcao = sc.nextInt();
            return opcao;
            }
            catch(Exception e){
                System.out.println("Opção inválida! Insira um número inteiro válido para continuar");
                pegaOpcao();
            }
        return 0;
    }
    
    public static String[] apagaNomes(String[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = "";
        }
        return array;
    }
}
