import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          int N = sc.nextInt();
        
          String[] a = new String[N];
          for(int i=0; i<N; i++){
               String str = sc.next();
               StringBuilder sb = new StringBuilder(str);
              String answer= sb.reverse().toString();
              a[i] = answer;
          }

          for(String x : a){
               System.out.println(x);
          }

     }
}
