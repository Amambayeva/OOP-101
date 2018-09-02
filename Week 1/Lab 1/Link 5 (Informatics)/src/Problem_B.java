import java.util.Scanner;

public class Problem_B {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int intArray[] = new int[x];

        for(int i = 0; i < x; i++) {
            intArray[i] = in.nextInt();
        }
        for(int i = 0; i < x; i++){
            if(intArray[i] % 2 == 0){
                System.out.print(intArray[i] + " ");
            }

        }
    }
}
