
package listaencadeada;

public class ListaEncadeada {
   
    public static void main(String[] args) {
       ListaLigada<Integer> vetor = new ListaLigada();
             int limite = 1000;
             for(int i = 0;i < limite;i++){
             vetor.adicionar(i);
         }
             Iterador cont = vetor.getIterador();
         while(cont.temProximo()){
             System.out.println(cont.pegarElemento().getvalor());
         }
    }
    
}
