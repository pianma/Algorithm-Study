import java.util.*;

class Main {

    public String solution(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                answer += (char)(str.charAt(i) + 32);
            }else if(str.charAt(i)>=97 && str.charAt(i)<=122){
                answer +=(char) (str.charAt(i) -32);
            }
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
