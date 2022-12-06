import java.util.*;

class Main {

    public int solution(int N, int M, int[] arr) {
        int answer = 0;
        int lt = 0;
        int sum = 0;
        for (int rt = 0; rt < N; rt++) {
            sum += arr[rt];
            if (sum == M) {
                answer++;
            }
            while (sum >= M) {
                sum -= arr[lt++];
                if (sum == M) {
                    answer++;
                }
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(N, M, arr));
    }
}
