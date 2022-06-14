import java.util.*;

class Main {

    public String solution(String str) {
        String answer = "NO";
      
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        String st = new StringBuilder(str).reverse().toString();

        if(st.equals(str)){
            answer = "YES";
        }
        
        return answer;
    }

       


    public static void main(String[] args) {
      Main T = new Main();
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();


       
  System.out.println(T.solution(str));
}
}
