import java.util.*;

class Main {

    public int[] solution(int N, int[] arr) {
        int[] answer = arr;
        int temp = 0;
        int start =0;
        while(start<=N) {
            for (int i = 1; i < N; i++) {
                if (answer[i-1] > answer[i]) {
                    temp = answer[i-1];
                    answer[i-1] = answer[i];
                    answer[i] = temp;
                }
            }
            start++;
        }


        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        for(int x : T.solution(N, arr)){
            System.out.print(x + " ");
        }
    }
}
