import java.util.*;

class Main {

    public int solution(int n) {
        int answer = 0;
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while (end_index != n) {
            if (sum == n) {
                end_index++;
                count++;
                sum = sum + end_index;
            } else if (sum > n) {
                sum = sum - start_index;
                start_index++;

            } else if (sum < n) {
                end_index++;
                sum = sum + end_index;
            }
        }
        answer = count;
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(T.solution(n));
    }
}
