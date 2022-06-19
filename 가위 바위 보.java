import java.util.*;

class Main {

    public ArrayList<Character>  solution(int n, int[] arrA,int[] arrB) {
      ArrayList<Character>  answer = new ArrayList<>();

      for(int i=0; i<n; i++){
        if(arrA[i]==arrB[i]){
          answer.add('D');
        }else if(arrA[i]==1 && arrB[i]==2){
          answer.add('B');
        }else if(arrA[i] ==1 && arrB[i]==3){
          answer.add('A');
        }else if(arrA[i]==2 && arrB[i]==1){
          answer.add('A');
        }else if(arrA[i]==2 && arrB[i]==3){
          answer.add('B');
        }else if(arrA[i]==3 && arrB[i]==1){
          answer.add('B');
        }else if(arrA[i]==3 && arrB[i]==2){
          answer.add('A');
        }

      }

     return answer;
    }

       


    public static void main(String[] args) {
      Main T = new Main();
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arrA = new int[n];
      for(int i=0; i<n; i++){
        arrA[i] = sc.nextInt();
      }

      int[] arrB = new int[n];
      for(int i=0; i<n; i++){
        arrB[i] = sc.nextInt();
      }

      
     for(char x : T.solution(n, arrA, arrB)){
      System.out.println(x);
     }
    }
}
