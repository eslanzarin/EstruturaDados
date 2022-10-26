public class Fila {
    
    public int inicio;
    public int fim;
    public int fila[];

    public Fila(){
        this.fila = new int[10];
        inicio = -1;
        fim = -1;
    }

    public void adicionar(int valor) {
        if(fim != fila.length - 1){
            if(inicio == -1) {

            }
            fim++;
            fila[fim] = valor;
    }
}
    public boolean isEmpty(){
        if (fim == -1 & inicio == -1){
            System.out.println("Fila vazia!");
            return true;
        }
        System.out.println("Fila contém itens!");
        return false;
    }

    public Object remover(){
        if (isEmpty()){
            return null;
        }

    int removeElemento = this.fila[0];

    this.fim--;
    for (int i = 0; i < this.fim; i++) {
        fila[i] = fila[i+1];
    }

    System.out.println("Item removido " + removeElemento);
    return removeElemento;

    }

    public void cheia() {
        if (this.fim == this.fila.length) {
            System.out.println("Fila cheia!");
        } else {
            System.out.println("Fila não está cheia!");
        }

    }

}