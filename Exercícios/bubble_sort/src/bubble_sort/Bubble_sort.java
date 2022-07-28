
package bubble_sort;

import java.util.Scanner;
public class Bubble_sort {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];
        
        for(int i =0; i < vetor.length;i++){
            System.out.println("Digite um número ");
            vetor[i] = entrada.nextInt();
        }
        
        for(int j = 0; j < vetor.length; j++){
            System.out.println(" "+vetor[j]+" ");
        }
       // Ordenação
        int caixa = 0;
       for(int i = 0; i < vetor.length; i++){
           for(int j= i+1; j < vetor.length;j++){
               if(vetor[i] > vetor[j]){
                   caixa =  vetor[i];
                   vetor[i] = vetor[j];
                   vetor[j] = caixa;
               }
           }
       }
       for(int y = 0; y < vetor.length; y++){
           System.out.print(" "+vetor[y]+" ");
       }
    }
    
}
