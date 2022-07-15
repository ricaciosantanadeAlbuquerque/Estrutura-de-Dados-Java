package listaencadeada;


public interface InterfaceMetodos<TIPO> {
 public abstract void adicionar(TIPO valor);
 public abstract void remover(TIPO valor);
 public abstract Elemento<TIPO> listar(int posicao);
}
