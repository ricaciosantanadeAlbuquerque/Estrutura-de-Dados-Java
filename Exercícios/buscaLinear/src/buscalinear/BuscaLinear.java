
package buscalinear;
import java.util.Scanner;
public class BuscaLinear {

    public static void main(String[] args) {
        
          String[] estado = new String[10]; // 0 a 9
          estado[0] = "PB";
          estado[1] = "AC"; // posições fixas
          estado[2] = "AM";
          estado[3] = "BA";
          estado[4] = "CE";
          estado[5] = "GO";
          estado[6] = "PA";
          estado[7] = "AM";
          estado[8] = "MT";
          estado[9] = "MG";
          for(int i = 0; i < estado.length;i++){
              System.out.println(estado[i]);
          }
          Scanner entrada = new Scanner(System.in);
          System.out.println("Digite a sigla do estado que busca UF ");
          String busca = entrada.next();
           boolean localizada = false; // partido da ideia que o valor não foi encontrado ou não será;
           
           for(int j = 0; j < estado.length;j++){ // j varia de valor entre 0 e 9
               String caixa = estado[j];
               if(busca.equalsIgnoreCase(caixa)){
                   localizada = true; 
                   break;
               }
           }
           if(localizada == true){
               System.out.println(" O valor foi encontrado");
           }else{
               System.out.println(" O valor nao foi encontrado dentro do array! ");
           }
    }
    
}
