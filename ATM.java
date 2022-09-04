import java.util.*;

class Main {

    public Integer solution(int[] a, int n) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            answer += sum;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(T.solution(a, n));
    }
}
