
package exe02_buscalinear;
import java.util.Scanner;
public class Exe02_buscalinear {
  
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String[] estado = new String[10];
        estado[0] = "AC";
        estado[1] = "BA";
        estado[2] = "CE";
        estado[3] = "DF";
        estado[4] = "AP";
        estado[5] = "PB";
        estado[6] =  "RN";
        estado[7] = "MS";
        estado[8] = "SP";
        estado[9] = "AM";
        System.out.println("Qual o estado voce esta buscando! ");
         String busca = entrada.nextLine();
         entrada.close();
       boolean achou = false;
       
       for(int i = 0; i < estado.length;i++){
           String elemento = estado[i];
           if(elemento.equalsIgnoreCase(busca)){
               achou= true;
               break;
           }
       }
       
       if(achou == true){
           System.out.println("\nO valor  foi achado ");
       }else{
           System.out.println("\nO valor nao foi encontrado");
       }
     
}
}