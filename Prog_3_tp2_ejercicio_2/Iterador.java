package Prog_3_tp2_ejercicio_2;

import java.util.Iterator;

class Iterador<T>  implements Iterator {
    private Node<T> cursor;

    public Iterador(Node<T> cursor) {
        this.cursor = cursor;
    }

    @Override
    public boolean hasNext() {
        if (this.cursor.getNext()!=null){
            return true;
        }
        return false;
    }
    public T valor(){
        return cursor.getInfo();
    }
    @Override
    public Object next() {
        Node<T> temp=this.cursor;
        this.cursor=this.cursor.getNext();
        return temp;
    }

}
