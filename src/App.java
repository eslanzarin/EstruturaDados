public class App {
    public static void main(String[] args) throws Exception {
       /* Pilha p1 = new Pilha();
       p1.desempilhar();
       p1.desempilhar();
       p1.desempilhar();
       p1.desempilhar(); */

       Fila f1 = new Fila();
       f1.adicionar(3);
       f1.adicionar(5);
       f1.adicionar(10);
       f1.adicionar(23);
       f1.isEmpty();
       f1.remover();
    }
}
