import java.util.*;


class Main {

    public int solution(int n, int[] arr) {
        int answer = 1;
        int start = 1;
        int end = 1;
        int sum = 1;
       while (end != n){
           if(sum== n){
               answer ++;
               end++;
               sum = sum + end;
           }else if(sum > n){
               sum = sum - start;
               start++;
           }else{
               end ++;
               sum = sum + end;
           }
       }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a= 1;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = a;
            a++;
        }
        System.out.println(T.solution(n, arr));
    }

}
