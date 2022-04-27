package Programacion_3.Prog_3_Ejercicio_7;

import java.util.ArrayList;
import java.util.List;

public class Arbol {
    private Integer raiz;
    private Arbol izquierda;
    private Arbol derecha;
    private Integer size;
    private List aux;
    private int cont;
    public Arbol(Integer valor){
        this.raiz=valor;
        this.izquierda=null;
        this.derecha=null;
        this.size=null;
        this.aux=new ArrayList<Integer>();
        this.cont=0;
    }

    private void hoja(Integer e) {
      this.raiz=null;
    }
    //caso 2) hoja con un hijo
    private boolean deleteConUnHijo(Integer e){
        if(this.izquierda!=null) {
            this.raiz = izquierda.raiz;
            this.izquierda = null;
            return true;
        }
        if (this.derecha!=null){
            this.raiz= derecha.raiz;
            this.derecha=null;
            return true;
        }
        return false;
    }

    public boolean delete(Integer elemento){
        if(this.isEmpty()){
            return false;
        }else if(this.raiz<elemento){
            return this.derecha.delete(elemento);
        }else if(this.raiz>elemento){
            return  this.izquierda.delete(elemento);
        }else if(this.raiz.equals(elemento)){
                if(this.izquierda == null && this.derecha==null){
                    this.hoja(elemento);
                    return true;
                }
        }else if(this.izquierda !=null || this.derecha!=null){
            return this.deleteConUnHijo(elemento);
        }else if(this.izquierda !=null && this.derecha!=null){
            return this.deleteConDosHijo(elemento);
        }

        return false;
    }
    public boolean hasElem(int valor) {
        if(this.raiz == valor) {
            return true;
        }else if(this.izquierda != null){
            return izquierda.hasElem(valor);
        }else if(this.derecha != null){
            return derecha.hasElem(valor);
        }else {
            return false;
        }
    }

    private boolean deleteConDosHijo(Integer elemento) {
        if(this.isEmpty()){
            return false;
        }else if(this.derecha!=null){
            Integer aux=this.derecha.maxIzquierda();
            this.raiz=aux;
            aux=null;
            return true;
        }

        return false;
    }

    private Integer maxIzquierda() {
        Integer temp=null;
        while(this.izquierda!=null){
            temp=this.izquierda.raiz;
        }
        return temp;
    }

    public void add(Integer nuevo){
        if(this.raiz==null){
            this.raiz=nuevo;
            this.size++;
        }else{

            if(this.raiz>nuevo){
                if(this.izquierda==null){
                    this.izquierda=new Arbol(nuevo);
                    this.size++;
                }else{
                    this.izquierda.add(nuevo);
                    this.size++;

                }

            }else if(this.raiz<nuevo) {
                if(this.derecha==null){
                    this.derecha=new Arbol(nuevo);
                    this.size++;
                }else{
                    this.derecha.add(nuevo);
                    this.size++;
                }

            }
        }
    }
    public void  printPreOrder(){
        if(this.raiz==null){
            System.out.print("-");
            return;
        }
        System.out.print(this.raiz+" ");
        this.izquierda.printPreOrder();
        this.derecha.printPreOrder();
    }
    public void  printPostOrder(){
        if(this.raiz==null){
            System.out.print("-");
            return;
        }
        this.izquierda.printPreOrder();
        this.derecha.printPreOrder();
        System.out.print(this.raiz+" ");
    }
    public void  printIntOrder(){
        if(this.raiz==null){
            System.out.print("-");
            return;
        }
        this.izquierda.printPreOrder();
        System.out.print(this.raiz+" ");
        this.derecha.printPreOrder();
    }

    public Integer  getRoot(){
        return this.raiz;
    }
    public Integer size(){
        return this.size;
    }

    public boolean isEmpty(){
        if(this.size>=0){
            return true;
        }
        return false;
    }
    public List getFrontera(){
        if(this.izquierda==null && this.derecha==null){
            this.aux.add(this.raiz);
        }

        return aux;
    }
    public Integer getMaxElem() {
        Integer value = 0;
        while(this.derecha != null) {
            value = derecha.raiz;
        }
        return value;
    }
    public List<Integer> getLongestBranch(){
        if(this.izquierda==null && this.derecha==null){
            List<Integer>hoja=new ArrayList<>();
            hoja.add(this.raiz);
            return hoja;
        }
        List<Integer>ramaIzq=new ArrayList<>();
        List<Integer>ramaDere=new ArrayList<>();
        if(this.izquierda!=null){
            ramaIzq.add(this.raiz);
            ramaIzq.addAll(getLongestBranch());
        }else if(this.derecha!=null){
            ramaDere.add(this.raiz);
            ramaDere.addAll(getLongestBranch());
        }
        if(ramaIzq.size()>=ramaDere.size()){
            return ramaIzq;
        }else{
            return ramaDere;
        }
    }

    public int getHeight(){
        

        return -1;
    }
}
