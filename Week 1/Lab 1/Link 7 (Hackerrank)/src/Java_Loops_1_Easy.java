import java.util.Scanner;

public class Java_Loops_1_Easy {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int k = N;
        for(int i = 1; i <= 10; i++){
            N*=i;

            System.out.println(k + " x " + i +  " = " + N);
            N/=i;

        }

    }
}
