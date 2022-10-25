public class Pilha {
    
    public int posicao;
    public Object[] pilha;

    public Pilha(){ //método construtor
        this.pilha = new Object[10]; // a nova pilha terá 10 posições 
        this.posicao = -1; // a posicao de início é -1 pq o índice do primeiro valor é sempre 0
    }

    public void empilhar(int valor){ //push - adiciona um novo valor ao topo da pilha
        if(this.posicao < this.pilha.length -1) { // se a posicao for menor q o tamanho da pilha, irá adicionar o valor passado como parâmetro
            this.pilha[++posicao] = valor;
        }

    }

    public Object desempilhar(){ // pop - remove o valor do topo
        if (isEmpty()){ // se estiver vazia, n fará nada
            System.out.println("Empty stack!");
            return null;
        }
        return this.pilha[this.posicao --]; // se n, irá remover o objeto do topo
    }

    public boolean isEmpty(){ // checa se está vazia
        if (this.posicao == -1){
            return true;
        }
        return false;
    }

    public Object verificarTopo(){ // top - exibe o valor do topo
        if (this.isEmpty()) { // se estiver vazia, n fará nada
            System.out.println("Empty stack!");
            return null;
        }
        return this.pilha[this.posicao]; // se n, retorna q
    }

    public void verificarTodos(){
        for(int i = this.posicao; i>=0; i--){
            System.out.println(this.pilha[i]);
        }
    }

    public int tamanho(){
        if (this.isEmpty()){
            return 0;
        }
    return this.posicao + 1;
    }

}
