package Prog_3_tp2_ejercicio_2;

public class Node<T>{
    private T info;
    private Node<T> next;
    private Node<T>previo;

    public Node(){
        info=null;
        next=null;
        previo=null;
    }

    public Node(T info, Node<T> next,Node<T> previo) {
        this.info = info;
        this.next = next;
        this.previo=previo;
    }

    public Node<T> getPrevio() {
        return previo;
    }

    public void setPrevio(Node<T> previo) {
        this.previo = previo;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
