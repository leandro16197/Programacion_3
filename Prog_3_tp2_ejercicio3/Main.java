package Prog_3_tp2_ejercicio3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int elemento=0;
        List<Integer>list=new ArrayList<Integer>();
        pasar(elemento,list);
    }

   public static List pasar(int elemento,List list){
        pasarBinario(elemento,list);
       Collections.reverse(list);
       return list;

    }
   public static void pasarBinario(int elemento,List list) {
        if(elemento>2){
                int resultado=elemento%2;
                list.add(resultado);
                pasarBinario(elemento/2,list);
        }

   }
}
