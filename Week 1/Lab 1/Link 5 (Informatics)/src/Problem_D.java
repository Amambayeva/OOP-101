import java.util.Scanner;

public class Problem_D {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int sum = 0;
        int intArray[] = new int[x];

        for(int i = 0; i < x; i++) {
            intArray[i] = in.nextInt();
        }
        for(int i = 1; i < x; i++){
            if(intArray[i] > (intArray[i - 1])){
                sum++;

            }
        }
        System.out.print(sum);
    }
}
