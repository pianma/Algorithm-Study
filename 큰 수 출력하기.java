import java.util.*;

class Main {

    public ArrayList<Integer>  solution(int n, int[] arrN) {
       ArrayList<Integer> answer = new ArrayList<>();
       answer.add(arrN[0]);
        for(int i=0; i<arrN.length-1; i++){
          if(arrN[i]<arrN[i+1]){
            answer.add(arrN[i+1]);
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
     

     for(int x: T.solution(n, arrN)){
      System.out.print(x + " ");
     }
    }
}
