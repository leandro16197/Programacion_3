package Prog_3_Ejercicio_6;

public class MySimpleLinkendList<T> {
    public Node<T> first;
    protected int size;
    public Node<T> cursor;

    public MySimpleLinkendList(){
        first=null;
        size=0;
    }

    public void insertFront(T info){
        Node<T> temp=new Node<T>(info,null,null);
        if(this.size()>0){
            temp.setNext(first);
            first.setPrevio(temp);
        }
        first=temp;
        size=size+1;
    }

    public T get(int pos){
        if((0>=pos) && (pos<this.size())){
            Node<T> temp=this.first.getNext();
            for(int i=0;i<pos;i++){
                temp = temp.getNext();
            }
            return  temp.getInfo();
        }
        return null;
    }

    public boolean isEmpty(){
        if(this.size()==0){
            return true;
        }
        return false;
    }
    public T extractFront(){
        if(!this.isEmpty()){
            if(this.size()>0){
                Node<T> aux = first;
                Node<T> temp= first.getNext();
                if(temp.getPrevio()!=null){
                    temp.setPrevio(null);
                }
                first = temp;
                this.size--;
                return aux.getInfo();
            }
        }
        return null;
    }
    public int size(){
        return size;
    }

    public int indexOf(T o){
        Node<T> temp=this.first;
        for(int i=0;i<this.size();i++){
            if(temp==o){
                return i;
            }else{
                temp=temp.getNext();
            }
        }
        return -1;
    }

    public Iterador<T> iniciarRecorrrido(){
        return new Iterador<>(first);
    }

    public void iniciar(){
        this.cursor=this.first.getNext();
    }
    public T obtener(){
        return this.cursor.getInfo();
    }
    public void avanzar(){
        this.cursor=this.cursor.getNext();
    }

    //PERTENECE AL MAIN
    //
    public void ListaIniciarRecorrido(){
        for(int i=0;i<this.size();i++){
            T val=this.obtener();
            this.avanzar();
        }
    }

}
