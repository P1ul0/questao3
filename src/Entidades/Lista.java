package Entidades;

public class Lista {
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Lista() {
        this.head = null;
        this.tail = null;
        
    }

    public void inserir(int newValue) {
        Node node = new Node(newValue);
        Node p = this.head;
        if (this.head == null) {
            this.head = node;
            this.tail = node;
        } else {
            while (p != null && node.getValue() > p.getValue()) {
                p = p.getNext();
            }
            if (p == null) {
                this.tail.setNext(node);
                node.setPrevious(this.tail);
                this.tail = node;
            } else if (p.equals(this.head)) {
                this.head.setPrevious(node);
                node.setNext(this.head);
                this.head = node;
            } else {
                node.setNext(p);
                node.setPrevious(p.getPrevious());
                p.getPrevious().setNext(node);
                p.setPrevious(node);
            }

        }

    }
    public void mesclar(Lista l){
        Node p = this.head;
        while (p != null){
            l.inserir(p.getValue());
            p = p.getNext();
            
        }

    }
    public void limpar(Lista l) {
        l.setHead(null);
        l.setTail(null);
    }

    public void print(){
        Node p = this.head;
        while (p != null){
            System.out.println(p.getValue());
            p =p.getNext();
        }
    }
}
