import java.util.*;

class Main {

    public int solution(int N, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
            answer = sum;
        }

        for (int i = k; i < N; i++) {
            sum += arr[i] - arr[i - k];
            answer = Math.max(answer, sum);
        }

        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(N, k, arr));
    }
}
