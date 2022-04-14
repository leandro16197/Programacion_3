package TP1_Prog3_ejercicio_5;

public class Pila<T> {

    private MySimpleLinkendList<T> lista;
    public Pila(){
        this.lista = new MySimpleLinkendList<T>();
    }

    public void push(T o){
        this.lista.insertFront(o);
    }
    public T pop(){
        return this.lista.extractFront();
    }
    public T top(){
        return this.lista.get(0);
    }
    public void reverse(){
        MySimpleLinkendList<T>aux=new MySimpleLinkendList<T>();
        for(int i=0;i<this.lista.size();i++){
               aux.insertFront(this.lista.get(i));
        }
        this.lista=aux;
    }

}
