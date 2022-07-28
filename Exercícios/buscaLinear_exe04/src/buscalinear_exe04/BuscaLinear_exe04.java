
package buscalinear_exe04;

import java.util.Scanner;

public class BuscaLinear_exe04 {

  
    public static void main(String[] args) {
   
       String[] letras = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
       
       for(int i = 0; i < letras.length; i++){
           System.out.println(i+" "+letras[i]+" ");
       }
       
       if(buscar(letras) == true){ // a chamada da função foi feita dentro de uma estrutura condicional porque
           // o retorno dessa função e boolean e lógico
           System.out.println("A letra existe ");
       }else{
           System.out.println("A letra nao existe! ");
       }
       
    }
    
    public static boolean buscar(String [] letras){
        Scanner in = new Scanner(System.in);
        String [] LETRAS = letras;
        String valor = "";
      
        System.out.println("Digite a letra que voce deseja ");
        String busca = in.next();
        boolean achou = false;
        
        for(int j =0; j < LETRAS.length;j++){
            if(LETRAS[j].equalsIgnoreCase(busca)){
                achou = true;
                break;
            }
        }
       return achou;
    }
    
}
