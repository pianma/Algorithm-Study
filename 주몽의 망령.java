import java.util.*;

class Main {

    public int solution(int n, int m, int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        int start_index = 0;
        int end_index = n - 1;

        while (start_index < end_index) {
            if (arr[start_index] + arr[end_index] < m) {
                start_index++;
            } else if (arr[start_index] + arr[end_index] > m) {
                end_index--;
            } else {
                count++;
                start_index++;
                end_index--;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, m, arr));
    }
}
