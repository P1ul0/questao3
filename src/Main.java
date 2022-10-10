import Entidades.Lista;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        Lista l1 = new Lista();
        l.inserir(1);
        l.inserir(3);
        l.inserir(2);
        l.inserir(4);
        l1.inserir(5);
        l1.inserir(6);
        l1.inserir(7);
        l1.inserir(8);
        l.mesclar(l1);
        l1.print();

    }
}
