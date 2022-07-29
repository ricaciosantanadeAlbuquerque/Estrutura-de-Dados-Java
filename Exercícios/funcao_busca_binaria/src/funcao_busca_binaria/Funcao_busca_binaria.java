
package funcao_busca_binaria;
import java.util.Scanner;
import java.util.Random;
public class Funcao_busca_binaria {
    public static void main(String[] args) {
    int[] retorno1 = preencher();
    int[] retorno2 = ordenadar(retorno1);
    
        if(buscar(retorno2)){ // posso fazer isso pois o retorno dessa função é lógico
            System.out.println("O valor foi encontrado ! ");
        }else{
            System.out.println("O valor não foi achado ! ");
        }
        
        System.exit(0);
    }
    // PREENCHENDO O VETOR 
    public static int[] preencher(){
        Random ale = new Random();
        int [] array = new int[10];
        
        for(int i =0; i < array.length;i++){
            array[i] = ale.nextInt(10)+1;
            System.out.println(" "+array[i]+" ");
        }
        return array;
    }
    // ORDENAÇÃO PELO MÉTODO BOLHA 
    public static int[] ordenadar(int[] ordem){
        // Método bolha
        int caixa = 0; 
        for(int i = 0; i < ordem.length;i++){
            for(int j = i + 1; j < ordem.length;j++){
                if(ordem[i] > ordem[j]){
                    caixa = ordem[i];
                    ordem[i] = ordem[j];
                    ordem[j] = caixa;
                }
            }
        }
        
        return ordem;
    }
    // BUSCA BINÁRIA
    public static boolean buscar(int[] vetor){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Didite o numero que voce busca");
        int numero = entrada.nextInt();
        entrada.close();
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length -1;// o comprimento do vetor - 1
        int meio;
        
        for(int i = 0;  i < vetor.length;i++){ // varrendo o vetor
            meio = (int)(inicio + fim) / 2;
            if(vetor[meio] == numero){
                achou = true;
                break;
            }else if(numero > vetor[meio]){
                inicio = meio + 1;
            }else if(numero < vetor[meio]){
                fim = meio - 1; 
            }
        }
        return achou;
    } 
}
