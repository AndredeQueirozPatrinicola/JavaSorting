package bublesortsalarios;

import java.util.Scanner;
import bublesortsalarios.BubleSort;

public class BubleSortSalarios {

    public static void main(String[] args) {
        BubleSort bs = new BubleSort(5);
        bs.insert();
        bs.display();
    }
    
        public static void getOption(int option, BubleSort buble)
    {
        switch(option)
        {
            case 1:
                buble.insert();
                break;
            case 2:
                buble.display();
                break;
            case 3:
                buble.sortByName();
                break;
            case 4:
                buble.sortBySalario();
                break;
            case 5:
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
        System.out.println("1 - Inserir funcionario");
        System.out.println("2 - Mostrar funcionarios");
        System.out.println("3 - Organizar funcionarios pelo nome");
        System.out.println("4 - Organizar funcionarios pelo salario");
        System.out.println("5 - Sair");
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
