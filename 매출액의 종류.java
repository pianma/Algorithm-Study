import java.util.*;

class Main {

    public ArrayList<Integer> solution(int m, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        int start = 0;
        int end = m;


        while(end<=arr.length){
            HashSet<Integer> hash = new HashSet<>();
            for(int i=start; i<end; i++){
                hash.add(arr[i]);

            }

            start++;
            end++;
           answer.add( hash.size());
        }




        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int x: T.solution(m, arr)){
            System.out.print(x + " ");
        }
    }
}
