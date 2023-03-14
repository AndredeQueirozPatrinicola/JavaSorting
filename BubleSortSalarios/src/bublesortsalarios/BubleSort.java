package bublesortsalarios;

import java.util.Scanner;
import bublesortsalarios.Funcionario;

public class BubleSort {

    Funcionario[] funcionarios;

    public BubleSort(int numeroFuncionarios) {
        this.funcionarios = new Funcionario[numeroFuncionarios];
    }

    public void insert() 
    {
        String nome = this.getName();
        double salario = this.getSalario();
        int i = 0;
        for(Funcionario f : this.funcionarios)
        {
            if(f == null)
            {
                this.funcionarios[i] = new Funcionario(nome, salario);
                break;
            }
            i++;
        }   
    }
    
    public void display()
    {
        for(Funcionario f : this.funcionarios)
        {
            if(f != null){
                System.out.println("-------");
                System.out.printf("Nome: %s \n", f.nome);
                System.out.printf("Salario: %.2f", f.salario);
            }            
        }
    }
    
    public void sortBySalario()
    {
        for(int i = 0; i < this.funcionarios.length; i++)
        {
            for(int j = 0; j< this.funcionarios.length; j++)
            {
                if(this.funcionarios[j].salario > this.funcionarios[j + 1].salario){
                    Funcionario aux = this.funcionarios[j];
                    this.funcionarios[j] = this.funcionarios[j + 1];
                    this.funcionarios[j + 1] = aux;
                }
            }
        }
    }
    
    public void sortByName()
    {
        for(int i = 0; i < this.funcionarios.length; i++)
        {
            for(int j = 0; j< this.funcionarios.length; j++)
            {
                if(this.funcionarios[j].nome.compareToIgnoreCase(this.funcionarios[j + 1].nome) > 0){
                    Funcionario aux = this.funcionarios[j];
                    this.funcionarios[j] = this.funcionarios[j + 1];
                    this.funcionarios[j + 1] = aux;
                }
            }
        }
    }

    public String getName() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Digite o nome do(a) funcionario: ");
            String res = sc.nextLine();
            return res;
        } catch (Exception e) {
            System.out.println("Valor inválido! Tente novamente");
            getName();
        }
        return "";
    }

    public double getSalario() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Digite o salario do(a) funcionario: ");
            double res = sc.nextDouble();
            return res;
        } catch (Exception e) {
            System.out.println("Valor inválido! Tente novamente");
            getSalario();
        }
        return 0.0;
    }

}
