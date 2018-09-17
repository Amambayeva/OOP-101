import java.util.Scanner;

    public class Convertor {
        public static String[] zero_to_nineteen = {"", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};
        public static String[] twenty_to_ninety = {
                "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        public static String inWords(int number) {
            if (number < 20) {
                return zero_to_nineteen[number];
            }
            if (number < 100) {
                return twenty_to_ninety[number / 10] + ((number % 10 != 0) ? " " : "") + zero_to_nineteen[number % 10];
            }
            if (number < 1000) {
                return zero_to_nineteen[number / 100] + " hundred " + "[and]" + ((number % 100 != 0) ? " " : "") + inWords(number % 100);
            }
            if (number < 100000) {
                return inWords(number / 1000) + " thousands" + ((number % 10000 != 0) ? " " : "") + inWords(number % 1000);
            }
            return null;
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == 0){
                System.out.println("zero");
            }
            System.out.println(inWords(input));
        }
    }
