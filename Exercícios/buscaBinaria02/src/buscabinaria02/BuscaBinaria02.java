
package buscabinaria02;

import java.util.Scanner;
public class BuscaBinaria02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] mil = new int[10000];
        int caixa =0;
        
        for(int j = 0; j < mil.length; j++){
            mil[j] = (int)(Math.random()* mil.length + 1);
            //System.out.print(" "+mil[j]+" ");
        }
        //ordenação pelo método bolha 
        int deposito = 0;
           for(int i = 0 ; i < mil.length; i++){
               for(int j = i+1; j < mil.length; j++){
                   if( mil[i] > mil[j]){
                       deposito =  mil[i]; // O maior valor vai para deposito 
                       mil[i] = mil[j]; // mil[i] fica vazio recebe o valor de mil[j]
                       mil[j] = deposito; // agora mil[j] está vezia e recebe o valor de deposito
                   }
               }
           }
           for(int i =0; i< mil.length;i++){
               System.out.print(" "+mil[i]+" \n");
           }
        // busca
        System.out.println("Digite o valor que você busca ");
        int valor = in.nextInt();
        boolean busca = false; //vamos partir da idéia de que o valor não existe
        int inicio = 0;
        int fim = mil.length - 1;
        int meio;
            
        for(int i = 0; i < mil.length; i++){
           meio = (int)(inicio + fim) / 2; 
            if(mil[meio] == valor){
                busca = true;
                caixa = mil[meio];
                break;
            }else if(mil[meio] < valor){
                inicio = meio + 1;
            }else{
                fim = meio - 1; 
            }
        }
        
        if(busca == true ){
            System.out.println("O valor  foi encontrado "+caixa);
        }else{
            System.out.println("O valor nao foi achado ");
        }
    }
    
}
