import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] B = new int[M];

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
           
        }

        Arrays.sort(A);

        for (int i = 0; i < M; i++) {
            boolean find = false;
            int target = sc.nextInt();
            int start = 0;
            int end = A.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                int midValue = A[mid];
                if (midValue > target) {
                    end = mid - 1;
                } else if (midValue < target) {
                    start = mid + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }
}
