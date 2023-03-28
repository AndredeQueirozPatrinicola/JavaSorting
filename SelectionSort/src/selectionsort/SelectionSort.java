package selectionsort;

import java.util.Scanner;

class SelectionSort {

 
    public static void main(String[] args) {
        int[] array;
        
        System.out.println("-------------------------------");
        System.out.println("Programa para ordernar utilizando");
        System.out.println("o algoritmo selection sort.");
        System.out.println("-------------------------------");
        
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o tamanho do array:");
                int arrLen = sc.nextInt();
                array = new int[arrLen];
                break;
            }
            catch(Exception e){
                System.out.println("Tamanho inválido! Insira um número inteiro para continuar");
            }
        }
        
        int x = 0;
        while(x < array.length){
            try{
                Scanner sc = new Scanner(System.in);
                System.out.printf("Coloque o %dº numero do array \n", x+1);
                int number = (int)sc.nextInt();
                array[x] = number;
                x++;
            }
            catch(Exception e)
            {
                System.out.println("Numero inválido!! Certifique-se de colocar um NÚMERO inteiro");
            }            
        }
        int[] listaOrdenada = ordenacaoPorSelecao(array);
        display(listaOrdenada);
    }
    
    public static int[] ordenacaoPorSelecao(int[] data){
        
        for(int i = 0;i < data.length - 1; i++){
            int menorValor = i;
            for(int j = (i + 1); j < data.length;j++){
                if(data[j] < data[menorValor]){
                    menorValor = j;
                }
            }
            if(data[i] != menorValor){
                int aux = data[i];
                data[i] = data[menorValor];
                data[menorValor] = aux;
            }
        }
        return data;
    }
    
    public static void display(int[] newData){
        System.out.println("Lista ordenada: ");
        System.out.print("[");
        for(int i : newData){
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println("]");
    }
}
