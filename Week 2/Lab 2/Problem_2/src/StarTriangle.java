import java.util.*;

public class StarTriangle{

      public int width;
      public static String star = "[*]";

      public StarTriangle(int w){
          width = w;
      }
      public String ToString(){
          String x = "";
          for(int i = 0; i <= width; i++){
              for(int j = 0; j < i; j++){
                  x+=star;
              }
              x+="\n";
          }
          return x;
      }
      public static void main(String []args){
        StarTriangle star1 = new StarTriangle(7);
        System.out.println(star1.ToString());
      }

}
