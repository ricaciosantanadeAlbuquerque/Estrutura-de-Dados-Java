
package buscabinaria_vs_buscalinear;

import java.util.Scanner;
public class BuscaBinaria_vs_buscaLinear {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    //  performado o codigo  busca binária vs busca Lienar
    int[] num1 = new int[1000000];
     for(int i = 0; i < num1.length;i++){
         num1[i] = i;
         //System.out.println(" "+num1[i]+" ");
     }
    // busca linear ======================================
        System.out.println("A  ULTIMA  POSICAO E 999999");
        System.out.println("====Busca Linear=====");
        System.out.println(" Digite o numero que vc busca ");
        int numero = in.nextInt();
        boolean achou = false;
        int valor = 0;
        int passos =0;
        double inicioTime = System.currentTimeMillis();
        for(int j = 0; j < num1.length;j++){
            passos++;
            if(num1[j] == numero){
                achou = true;
                valor = num1[j];
                break;
            }
        }
       double fimTime= System.currentTimeMillis();
       double timeLinear = inicioTime - fimTime;
        if(achou){
            System.out.println("O valor foi achado : "+valor);
        }else{
            System.out.println("O valor nao foi achado ");
        }
        
   //   busca binária=========================================================
              System.out.println("\n");
              System.out.println("============== Busca Binaria ==============");
              System.out.println(" Digite o numero que vc busca ");
              int numero1 = in.nextInt();
              
              boolean achado = false;
              int inicio = 0;
              int fim = num1.length -1 ;
              int meio;
              int valor1 = 0;
              int passos1 = 0;
              double inicioTime1 = System.currentTimeMillis();
              for(int x = 0; x < num1.length;x++){
                  meio = (int) (inicio + fim)/2; // primeiro soma depois divide
                  passos1++;
                  if(num1[meio] == numero1){
                      achado = true;
                      valor1 = num1[meio];
                      break;
                  }else if( numero1 > num1[meio]){
                      inicio = meio + 1;
                  }else if(numero1 < num1[meio]){
                      fim = meio -1;
                  }
              }
              double fimTime1= System.currentTimeMillis();
              double timeBinario = inicioTime1 - fimTime1;
              if(achado){
                  System.out.println("O valor foi achado "+valor1);
              }else{
                  System.out.println("O valor nao foi achado ");
              }
              
        // QUANTIDADE DE PASSOAS DA BUSCA LINER VS BUSCA BINÁRIA 
        System.out.println();
        System.out.println(" A quantidade de passos em um vetor de "+num1.length+" posicoes");
        System.out.print("Busca Linear: "+passos+" passos, e "+ timeLinear+" milissegundos foi  o tempo que levou para fazer o processo ");
        System.out.println(" VS ");
        System.out.println("Busca Binaria: "+passos1+" passos, e "+ timeBinario+" milissegundos foi  o tempo que levou para fazer o processo ");
        
    }
    
}
