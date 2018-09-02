import  java.util.*;

public class Problem_M {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int k;
        int sum = 0;
        for(int i = 0; i < N; i++){
            k = in.nextInt();
            if(k == 0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
