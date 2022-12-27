import java.util.*;

class Main {

    public ArrayList<Integer> solution(int N, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] arr2 = new int[N];
        int index = 0;
        int start = 0;

        for (int x : arr) {
            arr2[start] = x;
            start++;
        }

        Arrays.sort(arr);

        for (int x : arr) {
            if (x != arr2[index]) {
                answer.add(index + 1);
                index++;
            } else {
                index++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.solution(N, arr)) {
            System.out.print(x + " ");
        }
    }
}
