import java.util.*;

class Main {

    public int solution(String str) {
        int answer = 0;
    
        str = str.replaceAll("[^0-9]", "");
       
        answer = Integer.parseInt(str);

      

        
        return answer;
    }

       


    public static void main(String[] args) {
      Main T = new Main();
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();

     System.out.println(T.solution(str));
    }
}
