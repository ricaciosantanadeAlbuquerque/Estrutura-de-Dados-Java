
package ordenacao_valores;


public class Ordenacao_valores {

 
    public static void main(String[] args) {
        int[] array = {33,2,4,55,66,7,8,9,10,1,45}; // 11 posições
        // este vetor de nome array tem 1 posições variando de 0 a 10;
        
        
        for(int j =0; j < array.length; j++ ){
            System.out.println(array[j]);
        }
        // ordenando os valores  do array
        int caixa = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[i] > array[j]){
                    caixa =  array[i];
                    array[i] = array[j];
                    array[j]= caixa;
                }
            }
        }
      System.out.println("O valores ordenados");
      
      for(int j:array){
        System.out.print(" "+j+" ");
      }
    }
    
}
