package Prog_3_tp2_ejercicio_5;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        quicksort(array, 0, array.length - 1);
    }

    public static void quicksort(int[] array, int minimo, int maximo) {
        if (minimo >= maximo) {
            return;
        }
        int inicio = minimo;
        int fin = maximo;
        int pivot = array[minimo];

        while (inicio < fin) {
            while (inicio<fin&&array[fin]>=pivot){
                fin--;
            }
            if(array[fin]<=pivot){
                int temp=array[fin];
                array[fin]=array[inicio];
                array[inicio]=temp;
            }
            while(inicio<fin&&array[inicio]<=pivot){
                inicio++;
            }
            if(array[inicio]>=pivot){
                int temp=array[fin];
                array[fin]=array[inicio];
                array[inicio]=temp;
            }

        }

    }

}