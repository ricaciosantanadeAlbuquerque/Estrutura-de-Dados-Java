
package listaligada;

public class Elemento<TIPO> {
    private TIPO valor;
    private Elemento<TIPO> proximo; // aponta para o proximo objeto;
    
    public Elemento(TIPO valor1){
        this.valor = valor1;
    }
    public TIPO getValor(){
        return this.valor;
    }
    public void setValor(TIPO valor1){
        this.valor = valor1;
    }
    public Elemento<TIPO> getProximo(){
        return this.proximo;
    }
    public void setProximo(Elemento<TIPO> proximo1){
        this.proximo = proximo1;
    }
    
    
}
