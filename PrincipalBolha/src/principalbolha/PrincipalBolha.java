package principalbolha;

import java.util.Scanner;
import principalbolha.BubleSort;

public class PrincipalBolha {

    public static void main(String[] args) {
        System.out.println("Programa para estudar BubleSort");
        
        int arrLen = getData("tamanho do array");
        int variedadeDados = getData("variedade dos elementos do array");
        
        BubleSort buble = new BubleSort(arrLen, variedadeDados);
        
        while(true){
            menu();
            int opcao = getData("opção");
            getOption(opcao, buble);
        }
    }
    
    public static void getOption(int option, BubleSort buble)
    {
        switch(option)
        {
            case 1:
                buble.display();
                break;
            case 2:
                buble.random();
                break;
            case 3:
                buble.sort();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida! Tente novamente");
                break;
        }
    }
    
    public static void menu()
    {
        System.out.println("Digite uma opção: ");
        System.out.println("1 - Mostrar array");
        System.out.println("2 - Randomizar array");
        System.out.println("3 - Organizar array");
        System.out.println("4 - Sair");
    }
    
    public static int getData(String label)
    {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Digite o valor do(a) %s: ", label);
            int res = sc.nextInt();
            return res;
        }
        catch(Exception e)
        {
            System.out.println("Valor inválido! Tente novamente");
            getData(label);
        }
        return 0;
    }
    
    
}
