package Task1;

import java.util.Scanner;

public class Tester {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        Sequence s = new Sequence(scanner.next());
        Sequence s2 = new Sequence(scanner.next());
        if(s.isPalindrome()){
            System.out.println("Yes, it is a palindrome");
        }else System.out.println("No, it is not a palindrome");

        if(s.isSubString(s2)){
            System.out.println("Yes, it is a substring");
        }else System.out.println("No, it is not a sunbstring");

    }
}
