import java.util.*;

class Main {

    public int solution(int N,int M, int[] arr) {
        int answer = 1;

        Arrays.sort(arr);

        for(int x : arr) {
            if(x==M){
                break;
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(N,M,arr));
    }
}
