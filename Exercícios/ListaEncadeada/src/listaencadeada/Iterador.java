
package listaencadeada;
public class Iterador<TIPO> {
    private Elemento<TIPO> elemento;
    
    
    public Iterador(TIPO valor){
        this.elemento = (Elemento<TIPO>) valor;
    }
    public boolean temProximo(){
        if(elemento.getProximo()== null){
            return false;
        }else{
            return true;
        }
    }
    public Elemento<TIPO> pegarElemento(){
        this.elemento = elemento.getProximo();
        return elemento;
    }
}
