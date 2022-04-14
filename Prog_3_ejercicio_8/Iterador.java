package Prog_3_ejercicio_8;

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

    @Override
    public Object next() {
        T temp=this.cursor.getInfo();
        this.cursor=this.cursor.getNext();
        return temp;
    }
}
