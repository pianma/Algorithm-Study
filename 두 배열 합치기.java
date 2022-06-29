import java.util.*;

class Main {

    public ArrayList<Integer> solution(int a, int b, int[] arrA, int[] arrB) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < a && p2 < b) {
            if (arrA[p1] < arrB[p2]) {
                answer.add(arrA[p1]);
                p1++;
            }

            else {
                answer.add(arrB[p2]);
                p2++;

            }
        }

        while (p1 < a) {
            answer.add(arrA[p1]);
            p1++;
        }
        while (p2 < b) {
            answer.add(arrB[p2]);
            p2++;
        }

        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arrA = new int[a];
        for (int i = 0; i < a; i++) {
            arrA[i] = sc.nextInt();
        }

        int b = sc.nextInt();
        int[] arrB = new int[b];
        for (int i = 0; i < b; i++) {
            arrB[i] = sc.nextInt();
        }

        for (int x : T.solution(a, b, arrA, arrB)) {
            System.out.print(x + " ");
        }
    }
}
