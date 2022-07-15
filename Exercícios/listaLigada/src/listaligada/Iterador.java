
package listaligada;

public class Iterador {
private Elemento elemento;
   
public Iterador(Elemento op){
    this.elemento = op;
}

public Elemento getElemento(){
    this.elemento = elemento.getProximo();
    return this.elemento;
}

public boolean temProximo(){
    if(this.elemento.getProximo() == null){
        return false;
    }else{
        return true;
    }
}

}
