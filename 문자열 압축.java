import java.util.*;

class Main {

    public String  solution(String str) {
       String answer = "";
       str = str + " ";
       str = str.toUpperCase();
       int a = 1;
       for(int i=0; i<str.length()-1; i++){
        if(str.charAt(i)==str.charAt(i+1)){
            a++;
        }else{
            answer += str.charAt(i);
            if(a>1){
                answer += a;
                a=1;
            }
            
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
