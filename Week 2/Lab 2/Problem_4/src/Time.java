import java.util.Scanner;

    public class Time{
        public int hour;
        public int minute;
        public int second;

        public Time(int h, int m, int s){
            if(h >= 0 && h <= 23 && m >= 0 && m <= 59 && s >= 0 && s <= 59){
                hour = h;
                minute = m;
                second = s;
            }else
                System.out.println("ERROR!");
        }
        public String toUniversal(){
            String s = "";
            if(hour >= 10)
                s = s + hour + ":";
            else
                s = s + "0" + hour + ":";
            if(minute >= 10)
                s = s + minute + ":";
            else
                s = s + "0" + minute + ":";
            if(second >= 10)
                s = s + second;
            else
                s = s + "0" + second;
            return s;
        }

        public String toStandard(){
            String s = "";
            Boolean isOK = true;
            if(hour >= 0 && hour <= 10)
                s = s + "0" + hour + ":";
            else{
                if(hour == 11)
                    s = s + "11:";
                else {
                    if (hour - 12 <= 11)
                        s = s + (hour - 12) + ":";
                    else
                        s = s + "0" + (hour - 12) + ":";
                    isOK = false;
                }
            }
            if(minute>=10)
                s = s + minute + ":";
            else
                s = s + "0" + minute + ":";
            if(second >= 10)
                s = s + second;
            else
                s = s + "0" + second;
            if(isOK)
                s+=" AM";
            else
                s+=" PM";
            return s;
        }
        public Time add(Time t1){
            second+=t1.second;
            if(second > 59) {
                minute += second / 60;
                second%=60;
            }
            minute+=t1.minute;
            if(minute > 59) {
                hour+=minute / 60;
                minute%=60;
            }
            hour+=t1.hour;
            if(hour > 23)
                hour = hour%24;
            return new Time(hour, minute, second);
        }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        Time t = new Time(Integer.parseInt(in.next()),
                Integer.parseInt(in.next()),
                Integer.parseInt(in.next()));
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2 = new Time(Integer.parseInt(in.next()),
                Integer.parseInt(in.next()),
                Integer.parseInt(in.next()));
        System.out.println(t.add(t2).toUniversal());
    }
}