import java.util.Scanner;

public class Problem_E {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        int sum = 0;
        boolean ok = false;
        int intArray[] = new int[x];

        for(int i = 0; i < x; i++) {
            intArray[i] = in.nextInt();
        }
        for(int i = 0; i < x - 1; i++){
            if(intArray[i]*intArray[i+1] > 0){
                ok = true;
                break;
            }
        }
        if(ok) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
