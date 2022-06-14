import java.util.*;

class Main {

    public String solution(String str) {
        String answer = "";
        str =str.toLowerCase();
        String st = new StringBuilder(str).reverse().toString();

        if(st.equals(str)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        return answer;
    }

    public static void main(String[] args) {
      Main T = new Main();
      Scanner sc = new Scanner(System.in);
      String str = sc.next();


       
  System.out.println(T.solution(str));
}
}
