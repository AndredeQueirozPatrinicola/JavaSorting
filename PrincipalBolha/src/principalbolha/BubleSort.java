package principalbolha;

import java.util.Random;

public class BubleSort {
    
       int[] arr;
       int variedade;
       
       public BubleSort(int arrLen, int variedade){
           this.arr = new int[arrLen];
           this.variedade = variedade;
       }
       
       public void random()
       {
           for(int i = 0; i < this.arr.length;i++ ){
               Random random = new Random();
               this.arr[i] = random.nextInt(this.variedade);
           }
       }
    
       public void sort()
       {
           for(int i = 0; i < this.arr.length; i++){
               for(int j = 0; j < this.arr.length - 1; j++){
                   if(this.arr[j] > this.arr[j + 1]){
                       int aux = this.arr[j];
                       this.arr[j] = this.arr[j + 1];
                       this.arr[j + 1] = aux;
                   }
               }
           }
       }
       
       public void display()
       {
           System.out.print("[ ");
           for(int i : this.arr){
               System.out.printf("%d, ", i);
           }
           System.out.println("]");
       }       
}
