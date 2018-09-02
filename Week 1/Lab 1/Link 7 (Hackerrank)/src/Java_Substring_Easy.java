import java.util.*;

public class Java_Substring_Easy {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        String k = s.substring(x1, x2);
        System.out.println(k);
    }
}
