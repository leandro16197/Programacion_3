package Prog_3_tp2_Ejercicio_4;

public class main {
    public static void main(String[] args) {
        int [] array=new int[10];
        burbujeo(array);
        selection(array);
    }
        public static void selection(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                int min = i;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] < nums[min]) {
                        min = j;
                    }
                }
                int swap = nums[i];
                nums[i] = nums[min];
                nums[min] = swap;
            }
        }

        public static void burbujeo(int [ ] array) {
            int aux;
            for (int i=0; i < array.length - 1; i++){
                for (int j=0; j < array.length-i-1;j++){
                    if (array[ j ] >array[ j+1 ]) {
                        aux = array[ j+1 ];
                        array[ j+1 ] = array[ j ];
                        array[ j ] = aux;
                }
            }
        }
    }
}
