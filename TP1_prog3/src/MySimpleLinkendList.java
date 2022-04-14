public class MySimpleLinkendList<T> {
    protected Node<T> first;
    protected int size;
    public MySimpleLinkendList(){
        first=null;
        size=0;
    }

    public void insertFront(T info){
        Node<T> temp=new Node<T>(info,null);
        temp.setNext(first);
        first=temp;
        size=size+1;
    }
    public T get(int pos){
        Node<T> temp=this.first.getNext();
            for(int i=0;i<pos;i++){
                temp = temp.getNext();
            }
        return  temp.getInfo();
    }

    public boolean isEmpty(){
        if(this.size()==0){
            return true;
        }
        return false;
    }
    public T extractFront(){
        if(!this.isEmpty()){
            if(this.size()>1){
                Node<T> aux = first;
                Node<T> temp= first.getNext();
                first = temp;
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
}
