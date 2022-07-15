
package listaligada;

public class ListaEncadeada<TIPO> implements InterfaceLista<TIPO> {
    private Elemento<TIPO> primeiro;
    private Elemento<TIPO> ultimo;
    private int tamanho;
    
    public ListaEncadeada(){
        this.tamanho = 0;
    }
    
    // get set
    public Elemento<TIPO> getPrimeiro(){
        return this.primeiro;
    }
    public void setPrimeiro(Elemento<TIPO> primeiro1){
        this.primeiro = primeiro1;
    }
    public Elemento<TIPO> getUltimo(){
        return this.ultimo;
    }
    public void setUltimo(Elemento<TIPO> ultimo1){
        this.ultimo = ultimo1; 
    }
    public int getTamanho(){
        return tamanho;
    }
    public void setTamanho(int tamanho1){
        this.tamanho = tamanho1;
    }
    @Override // polimorfismo de sobreposição
    public void adicionar(TIPO valor){
 
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);// o objeto elemento foi criado para guardar o que foi passado para lista
        if(this.primeiro == null && this.ultimo == null){ //  adicionando o objeto novo elemento na lista caso não exista nem um nela 
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        }else{
            this.ultimo.setProximo(novoElemento); // o ultimo vai ter um proximo que é o novo elemento que acabou de entrar;
            this.ultimo = novoElemento; // agora esse novo elemento é o ultimo;
        }
        this.setTamanho(this.getTamanho()+1);
    }
   @Override
   public void remover(TIPO valor1){
       Elemento<TIPO> atual = this.primeiro;
       Elemento<TIPO> anteriro = null;
       for(int i = 0; i < this.getTamanho();i++){
          if(atual.getValor().equals(valor1)){
              if(atual == this.primeiro && atual == this.ultimo){
                    this.primeiro = null;
                    this.ultimo = null;
              }else if(atual == this.primeiro){
                  this.primeiro = atual.getProximo();
                  atual.setProximo(null);
                  
              }else if(atual == this.ultimo){
                  anteriro.setProximo(null);
                  this.ultimo = anteriro;
                  
              }else{
                  anteriro.setProximo(atual.getProximo());
                  atual= null;
              }
              
              this.tamanho--;
              break;
          }
          
          anteriro = atual;
          atual = atual.getProximo();
       }
   }
   @Override
   public Elemento<TIPO> pegar(int posicao){
       Elemento atual = this.primeiro;
       for(int j =0; j < posicao;j++){
          if(atual.getProximo() != null){
              atual = atual.getProximo(); // sobrepos o valor anterior 
          }
       }
       return atual;
   }
   public Iterador getIterador(){
       return new Iterador(this.primeiro);
       
}
}