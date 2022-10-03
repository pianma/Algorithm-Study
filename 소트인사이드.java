import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Integer[] a = new Integer[str.length()];

        for (int i = 0; i < a.length; i++) {

            a[i] = str.charAt(i) - '0';
        }

        Arrays.sort(a, Collections.reverseOrder());

        for (int x : a) {
            System.out.print(x);
        }
    }

}
