import java.util.*;

class Main {

    public int  solution(int n, int[] arrN) {
      int answer = 0;
      answer ++;
      int a =0;
      for(int i=0; i<arrN.length; i++){
        if(arrN[a]<arrN[i]){
          answer++;
          a=i;
        }
      }

     return answer;
    }

       


    public static void main(String[] args) {
      Main T = new Main();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arrN = new int[n];
      for(int i=0; i<n; i++){
        arrN[i] = sc.nextInt();
      }
     

      System.out.println(T.solution(n, arrN));
    }
}
