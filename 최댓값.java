import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[9];
        int max = 0;
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
