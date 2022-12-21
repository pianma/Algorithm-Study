import java.util.*;

class Main {

    public int[] solution(int N, int[] arr) {
        int[] answer = new int[N];

        answer = arr;

        int min;
        int temp=0;
        int index=0;

        for (int i = 0; i < N; i++) {
            min = Integer.MAX_VALUE;
            for (int j = i; j < N; j++) {
                if (min > answer[j]) {
                    min = answer[j];
                    index = j;
                }
            }
            temp = answer[i];
            answer[i] =answer[index];
            answer[index] = temp;
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
