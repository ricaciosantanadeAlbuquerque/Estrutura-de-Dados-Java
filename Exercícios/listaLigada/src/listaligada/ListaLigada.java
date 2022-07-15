
package listaligada;


public class ListaLigada {

   
    public static void main(String[] args) {
            
        ListaEncadeada<Integer> lista = new ListaEncadeada();
               int limite = 1000;
             for(int i = 0;i < limite;i++){
             lista.adicionar(i);
         }
             Iterador cont = lista.getIterador();
         while(cont.temProximo()){
             System.out.println(cont.getElemento().getValor());
         }
       
        
}
}