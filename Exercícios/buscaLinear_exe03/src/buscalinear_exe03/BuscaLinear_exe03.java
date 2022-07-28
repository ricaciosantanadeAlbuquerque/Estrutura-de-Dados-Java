
package buscalinear_exe03;
import java.util.Scanner;

public class BuscaLinear_exe03 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int[] banco = new int[100];
        int dado = 0;
       
       for(int i = 0; i < banco.length;i++){
           banco[i] =  (int) (Math.random() *  banco.length);
           System.out.print(" "+banco[i]+" ");
       }
       // busca linear
       System.out.println();
      System.out.println(" digite o valor numérico que voce busca ! "); 
      int valor = entrada.nextInt();
      entrada.close();
      boolean achou = false; // vamos parti do principio que esse valor não existe dentro do vetor
      
      for(int j = 0; j < banco.length; j++){
        if(banco[j] == valor){ // se o valor buscado for igual ao vetor na posição j
            achou = true; // então o valor foi encontrado
             dado = banco[j];
            break; // saimos do loop
        }
      }
      
      if(achou ==  true){
          System.out.println(" O valor foi achado : "+ dado);
      }else{
          System.out.println("O valor nao existe !");
      }
          System.exit(0);
    }

}
