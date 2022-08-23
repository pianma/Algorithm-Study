import java.util.*;

class Main {

    public int solution(int n, int[] arr) {
        int count = 0;
        int start_index = 0;
        int end_index = n - 1;
        while (end_index != n) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[start_index] + arr[end_index] == arr[i]) {
                    end_index--;
                  
                } else if (arr[start_index] + arr[end_index] < arr[i]) {
                    end_index++;
                } else {
                    start_index++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = 1;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = m;
            m++;
        }

        System.out.println(T.solution(n, arr));
    }
}
