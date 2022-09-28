import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        double max = a[n - 1];
        double avg = 0;

        for (int i = 0; i < n; i++) {
            avg += (a[i] / max) * 100.0;
            System.out.println(a[i]);
        }
        avg = avg / n;
        System.out.println(avg);

    }

}
