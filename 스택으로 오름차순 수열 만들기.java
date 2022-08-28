import java.util.*;

class Main {

    public ArrayList<String> solution(int n, int[] arr, boolean result) {
        ArrayList<String> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int num = 1;

        for (int i = 0; i < arr.length; i++) {
            int su = arr[i];
            if (su >= num) {
                while (su >= num) {
                    stack.push(num++);
                    answer.add("+");
                }
                stack.pop();
                answer.add("-");
            } else {
                int a = stack.pop();
                if (n > su) {
                    System.out.println("NO");
                    result = false;
                    break;

                } else {
                    answer.add("-");
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean result = true;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (String x : T.solution(n, arr, result)) {
            if (result)
                System.out.println(x);
        }
    }
}
