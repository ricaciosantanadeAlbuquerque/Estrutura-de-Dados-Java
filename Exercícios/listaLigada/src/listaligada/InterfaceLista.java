
package listaligada;

public interface InterfaceLista<TIPO> { 
 public abstract void adicionar(TIPO valor);
 public abstract void remover(TIPO valor1);
 public abstract Elemento pegar(int poiscao);
}
