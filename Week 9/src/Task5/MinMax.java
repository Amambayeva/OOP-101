package Task5;

public class MinMax {
    static class Pair
    {
        public int max;
        public int min;
        public Pair(int max,int min)
        {
            this.max = max;
            this.min = min;
        }
        public String toString()
        {
            return "Max:" + this.max + "  " + "Min:" + this.min;
        }

    }
    public static Pair minMax(int []a)
    {

        int maximum = -1000000000;
        int minimum = 1000000000;
        for(int i=0;i<a.length;i++)
        {
            if(maximum < a[i])
            {
                maximum = a[i];
            }
            if(minimum > a[i])
            {
                minimum = a[i];
            }
        }
        Pair pair = new Pair(maximum, minimum);
        return pair;
    }

}