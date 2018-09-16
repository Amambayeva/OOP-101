import java.util.Scanner;

    public class Time {
        public int hour;
        public int minute;
        public int second;

        public Time(int h, int m, int s) {
            if (h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59) {
                hour = h;
                minute = m;
                second = s;
            } else
                System.out.println("WRONG FORMAT");

        }

        public String toUniversal() {
            String str = "";
            if (hour >= 10)
                str += hour + ":";
            else
                str += "0" + hour + ":";
            if (minute >= 10)
                str += minute + ":";
            else
                str += "0" + minute + ":";
            if (second >= 10)
                str += second;
            else
                str += "0" + second;
            return str;

        }

        public String toStandard() {
            String str = "";
            Boolean ok = true;
            if (hour >= 0 && hour <= 10)
                str += "0" + hour + ":";
            else {
                if (hour == 11)
                    str += "11:";
                else {
                    if (hour - 12 <= 11)
                        str += (hour - 12) + ":";
                    else
                        str += "0" + (hour - 12) + ":";
                    ok = false;
                }
            }
            if (minute >= 10)
                str += minute + ":";
            else
                str += "0" + minute + ":";
            if (second >= 10)
                str += second;
            else
                str += "0" + second;
            if (ok)
                str += " AM";
            else
                str += " PM";

            return str;

        }

        public Time add(Time t1) {
            second += t1.second;
            if (second > 59) {
                minute += second / 60;
                second %= 60;
            }
            minute += t1.minute;
            if (minute > 59) {
                hour += minute / 60;
                minute %= 60;
            }
            hour += t1.hour;
            if (hour > 23)
                hour%= 24;
            return new Time(hour, minute, second);
        }


    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        Time t = new Time(13, 23, 23);
        System.out.println("Universal-> " + t.toUniversal());
        System.out.println("Standard-> " + t.toStandard());
        Time t1 = new Time(2,3,3);
        System.out.println("\n" + "Addition-> " + t.add(t1).toUniversal());
    }
}