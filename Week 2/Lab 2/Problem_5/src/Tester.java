import java.util.*;

        public class Tester{
        public int[] arr(int[] a){
            int[] arr1 = new int[a.length * 2];
            int i = 0;
            for(int j = 0; j < arr1.length; j++) {
                arr1[j] = a[i];
                if (j % 2 == 1)
                    i++;
            }
            return arr1;
            }

        public static void main(String[] args){
        Tester t = new Tester();
        int[] x = new int[4];
        for(int j = 0; j < 4; j++){
            x[j] = j + 1;
        }
        int[] n = t.arr(x);
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }
    }
}