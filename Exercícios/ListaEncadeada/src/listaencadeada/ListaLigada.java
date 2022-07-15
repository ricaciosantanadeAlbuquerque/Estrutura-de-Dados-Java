package listaencadeada;


public class ListaLigada<TIPO> implements InterfaceMetodos<TIPO>{
    private Elemento<TIPO>  primeiro;
    private Elemento<TIPO>  ultiumo;
    private int tamanho;
    
    public ListaLigada(){
        this.tamanho = 0;
    }
    public Elemento<TIPO> getPrimeiro(){
        return this.primeiro;
    }
    public void setPrimeiro(Elemento<TIPO> primeiro1){
        this.primeiro = primeiro1;
    }
    public Elemento<TIPO> getUltimo(){
        return this.ultiumo;
    }
    public void setUltimo(Elemento<TIPO> ultimo1){
        this.ultiumo = ultimo1;
    }
    public int getTamanho(){
        return this.tamanho;
    }
    public void setTamanho(int tamanho1){
        this.tamanho = tamanho1;
    }
    @Override
    public void adicionar(TIPO valor) {
        Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
        if(this.primeiro == null && this.ultiumo == null){ // é ´porque não existe objeto adicinonado
            this.primeiro = novoElemento;
            this.ultiumo = novoElemento;
        }else if(this.ultiumo!= null){
            this.ultiumo.setProximo(novoElemento);
            this.ultiumo = novoElemento;
        }
        this.tamanho++;
    }

    @Override
    public void remover(TIPO valor) {
        Elemento<TIPO> anterior = null;
        Elemento<TIPO> atual = this.primeiro;
        for(int j = 0; j < this.tamanho;j++){
           
            if(atual.getvalor().equals(valor)){
                 if(this.tamanho == 1){
                this.primeiro = null;
                this.ultiumo = null;
// se for um if separado vai dar erro              
                }else if(atual.equals(this.primeiro)){
                    this.primeiro = atual.getProximo(); // recebe o proximo do atual, o primeiro não será mais o atual mais sim seu proximo
                      atual.setProximo(null);// o atual que era o primeo não apontará para um próximo;
                      atual = null;
                }else if( atual.equals(this.ultiumo)){
                    anterior.setProximo(null);
                    this.ultiumo = anterior;
                }else{
                   anterior.setProximo(atual.getProximo()); // anterior configura  seu próximo não para o atual, mas para o próximo objeto de atual
                   //atual.setProximo(null); // atual não enchegar mais um proximo 
                   atual = null;
            }
           this.tamanho --;
           break;
        }    
         anterior = atual;
         atual = atual.getProximo();
    }
    }
    @Override
    public Elemento<TIPO> listar(int posicao) {
        Elemento<TIPO> atual = this.primeiro; // a  variável atual recebe o primeiro elemento;
        // será feito um loop que vai variar de zero até a posição passada
        for(int i =0; i < posicao;i++){
            if(atual.getProximo() != null){ // se o atual tiver um proximo
                atual = atual.getProximo();// o atual recebe o proximo
                
            }
        }
        return atual;
    }
    public Iterador<TIPO> getIterador(){
       Iterador<TIPO> contador = new Iterador(this.primeiro);
       return contador;
    }
    
}