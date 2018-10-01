import java.util.Scanner;
public class ChessGame {
    public static String[][] game = new String[8][8];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String board = "RNBQKBNR";
        initBoard(board, game);
        System.out.println(toString(game));

        while(true) {
            System.out.println("enter first row: ");
            int r1 = in.nextInt();
            System.out.println("enter first column: ");
            int c1 = in.nextInt();

            System.out.println("enter second row: ");
            int r2 = in.nextInt();
            System.out.println("enter second column: ");
            int c2 = in.nextInt();
            move(r1, c1, r2, c2, game);
            System.out.println(toString(game));
        }
    }

    public static void initBoard(String board, String[][] game) {
        for(int c = 0; c < 8; c++) {

            game[7][c]= board.substring(c, c + 1).toLowerCase();
            game[6][c]= "p";
            game[1][c]= "P";
            game[0][c]= board.substring(c, c + 1);
        }
    }

    public static String toString(String[][] game) {
        String temp = "";
        for(int r = 7; r >= 0; r--) {
            for(int c = 0; c < 8; c++) {
                if(game[r][c] == null) {
                    temp +="[ ]";
                }
                else {
                    temp += "["+game[r][c]+"]";
                }
            }
            temp +="\n";
        }
        return temp;
    }

    public static void move(int r1, int c1, int r2, int c2, String[][] game) {
        game[r2][c2] = game[r1][c1];
        game[r1][c1] = null;
    }
}