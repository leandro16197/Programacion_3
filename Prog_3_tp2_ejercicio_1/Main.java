package Prog_3_tp2_ejercicio_1;

public class Main {
    public static void main(String[] args) {
           int [] arr=new int[10];
           // arr[0,1,2,3,4,5,6,7,8,9];
            int pos=0;
            comprobarOrdenamiento(arr,pos);
    }

   public static int comprobarOrdenamiento(int [] arr,int pos) {
       if (pos <= arr.length - 1) {
           if (arr[pos] <= arr[pos + 1]) {
               return comprobarOrdenamiento(arr, pos + 1);
           } else {
               return 0;
           }
       }
       return -1;
   }
}
