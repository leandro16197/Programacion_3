package Prog_3_Ejercicio_7;

public class Arbol {
    private Integer raiz;
    private Arbol izquierda;
    private Arbol derecha;

    public Arbol(Integer valor){
        this.raiz=valor;
        this.izquierda=null;
        this.derecha=null;
    }
    public void add(Integer nuevo){
        if(this.raiz==null){
            this.raiz=nuevo;
        }else{
            if(this.raiz>nuevo){
                if(this.izquierda==null){
                    this.izquierda=new Arbol(nuevo);
                }else{
                    this.izquierda.add(nuevo);
                }
            }else if(this.raiz<nuevo) {
                if(this.derecha==null){
                    this.derecha=new Arbol(nuevo);
                }else{
                    this.derecha.add(nuevo);
                }
            }
        }
    }
}
