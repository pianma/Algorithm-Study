import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken()); 
        int M = Integer.parseInt(stringTokenizer.nextToken()); 
        int [] num = new int[N+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i=1; i<=N; i++){
            num[i] = num[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int q = 0; q<M; q++){ 
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(num[j]-num[i-1]);
        }
    }
}
 
//Scanner 로 이용한 풀이
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] S = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            S[i] = S[i - 1] + sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            int l = sc.nextInt();
            System.out.println(S[l] - S[k - 1]);
        }
    }
}
