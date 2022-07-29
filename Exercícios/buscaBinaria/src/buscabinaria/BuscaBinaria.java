
package buscabinaria;
import java.util.Scanner;
public class BuscaBinaria {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int[] num1 = new int[100];
       
       for(int i =0; i < num1.length; i++){ // de 0 a 99
           num1[i] = i * 2;
       }
       // buscando o valor
       System.out.println("Digite o valor que voce busca! ");
       int buscar = in.nextInt();
       boolean achou = false; // vamos parti do principio de que não existe o valor no vetor 
       int inicio = 0;
       int fim = num1.length - 1; // a posição final é sempre tamaho -1
       int meio;
       for(int j = 0;j < num1.length;j++){
           meio = (int)(inicio + fim)/2;
           if(num1[meio] == buscar){
               achou = true;
               break;
           }else if(num1[meio] < buscar){
               inicio = meio + 1;
           }else{
               fim = meio - 1;
           }
       }
       if( achou  == true){
           System.out.println("O valor foi encontrado !");
       }else{
           System.out.println("O valor não foi achado ");
       }
    }
    
}
