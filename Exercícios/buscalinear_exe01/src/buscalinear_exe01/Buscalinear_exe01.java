
package buscalinear_exe01;
import java.util.Random;
import java.util.Scanner;
public class Buscalinear_exe01 {

    public static void main(String[] args) {
       int[] vetor = preencher();
        int valor;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Digite o valor numerico entre [1] e [40] que deseja achar !");
            valor = in.nextInt();
        }
          int resultado = buscar(valor,vetor);
          if(valor == resultado){
              System.out.println("O valor da busca e "+resultado);
          }else{
              System.out.println("O valor  nao foi achado ");
          }
          System.exit(0);
    }
    //=========================================================================================================
    public static int[] preencher(){
      Random aleatorio = new Random();
      int[] dados = new int[40];
      
      for(int i = 0; i< dados.length;i++){
          dados[i] = aleatorio.nextInt(40)+1;
      }
      for(int j :dados){
          System.out.println(j);
      }
      return dados;
    }
 //==============================================================================================================   
    public static int  buscar(int busca,int[]vetor){
        int[] dados = vetor;
        int valor = 0;

        for(int resut :dados){
            if(resut == busca){
               valor = resut;
               break;
            }
        }
        
        return valor;
    }
    
}
