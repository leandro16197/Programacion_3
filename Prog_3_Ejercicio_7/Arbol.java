package Programacion_3.Prog_3_Ejercicio_7;

public class Arbol {
    private Integer raiz;
    private Arbol izquierda;
    private Arbol derecha;
    private Integer size;

    public Arbol(Integer valor){
        this.raiz=valor;
        this.izquierda=null;
        this.derecha=null;
        this.size=null;
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
}
