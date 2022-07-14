import java.util.*;

class Main {

    public double solution(int n, int arr[]) {
        double answer = 0;
        double max=0;
        double sum=0;
        for(int i=0; i<n; i++){

            if(arr[i]>max){
                max= arr[i];


            }
            sum += arr[i];
        }
        answer=    (sum*100)/max/n;


        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n,arr));

    }
}
