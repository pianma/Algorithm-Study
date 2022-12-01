import java.util.*;

class Main {

    public int solution(int[] arr, int[] arrB) {
        int answer = 0;


        if(arr[0]==1){
            arrB[0]=1;
        }else {
            arrB[0]=0;
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i]!=1){
                arrB[i] =0;
            }else{
                if(arr[i-1] != arr[i]){
                    arrB[i]=1;
                }else{
                    arrB[i] = arrB[i-1]+1;
                }
            }

        }


        for(int i=0; i<arrB.length; i++){
           answer += arrB[i];
        }

      

        

        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arrB = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(arr,arrB));
    }
}
