package Task1;
import java.lang.String;

public class Sequence {
    private String t;

    public Sequence(String str) {
        t = str;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getT() {
        return t;
    }

    public boolean isPalindrome() {

        String reverse = "";
        for (int i = t.length() - 1; i >= 0; i--)
            reverse = reverse + t.charAt(i);
        if (t.equals(reverse))
            return true;
        return false;
    }

    public boolean isSubString(Sequence s) {
        if (this.t.contains(s.t))
            return true;
        return false;
    }

}











