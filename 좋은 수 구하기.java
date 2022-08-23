import java.util.*;

class Main {

    public int solution(int n, int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int start_index = 0;
            int end_index = n - 1;
            int find = arr[i];
            while (start_index < end_index) {
                if (arr[start_index] + arr[end_index] == find) {
                    if (start_index != i && end_index != i) {
                        count++;
                        break;
                    } else if (start_index == find) {
                        start_index++;
                    } else if (end_index == find) {
                        end_index--;
                    }
                } else if (arr[start_index] + arr[end_index] < find) {
                    start_index++;
                } else {
                    end_index--;
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
