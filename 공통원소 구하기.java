import java.util.*;

class Main {

    public ArrayList<Integer> solution(int n, int m, int[] arr, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        Arrays.sort(arr2);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i] == arr2[j]) {
                    answer.add(arr[i]);
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int x : T.solution(n, m, arr, arr2)) {
            System.out.print(x + " ");
        }
    }
}
