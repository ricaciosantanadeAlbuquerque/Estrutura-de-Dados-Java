
package algoritmo_bolha;


public class Algoritmo_bolha {

  
    public static void main(String[] args) {
        int[] num1 = new int[10];
        
       for(int i = 0; i < num1.length;i++){
            num1[i] =  (int)(Math.random() * num1.length+1);// estou gerando valores entre 0 e 10;
            System.out.println(num1[i]);
       }
       System.out.print("========================================================");
       
       int aux = 0;
       for(int i = 0; i < num1.length; i++){
           for(int j = i+1; j <num1.length;j++){ // for aninhado
               if(num1[i] > num1[j]){ // faremos uma ordenação crescente
                  aux = num1[i];
                  num1[i] =  num1[j];
                  num1[j] = aux;
                          
               }
           }
       }
       System.out.println("OS valores do vetor[num1] ordenados ");
      for(int x =0; x < num1.length; x++){
          System.out.print(" "+num1[x]+" ");
      }
       
    }
    
}
