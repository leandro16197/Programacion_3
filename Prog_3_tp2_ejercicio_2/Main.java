package Prog_3_tp2_ejercicio_2;

public class Main {
    public static void main(String[] args) {
            MySimpleLinkendList list1=new MySimpleLinkendList();
            MySimpleLinkendList list2=new MySimpleLinkendList();
           MySimpleLinkendList list3=compararLista(list1,list2);
        Iterador<Integer>ite=new Iterador<Integer>(list1.cursor);
           Integer elemento=0;
           buscarElemento(elemento,list1,ite);



    }
    public static boolean buscarElemento(Integer elemento,MySimpleLinkendList list1,Iterador ite){
       while (!list1.isEmpty() && ite.next()!=null){
            if (ite.valor()==elemento){
                return true;
            }else {
                ite.next();
                return buscarElemento(elemento,list1,ite);
            }
       }

        return false;
    }



    public static MySimpleLinkendList compararLista(MySimpleLinkendList list1, MySimpleLinkendList list2){
        Iterador<Integer> posList1=new Iterador<Integer>(list1.cursor);
        Iterador<Integer> posList2=new Iterador<Integer>(list2.cursor);
        MySimpleLinkendList<Integer> aux=new MySimpleLinkendList<Integer>();
        while(!list1.isEmpty() && !list2.isEmpty() && posList1.hasNext() && posList2.hasNext()){

            if(posList1.valor()==posList2.valor()){//equals
                aux.insertFront(posList1.valor());
                posList1.next();
                posList2.next();
            }

            if(posList1.valor() < posList2.valor()){
                posList1.next();
            }
            if (posList1.valor()> posList2.valor()){
                posList2.next();
            }

        }
        return aux;
    }
}
