import java.util.*;

class Main {

    public String solution(int N, int[] arr) {
        String answer = "";
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int x : arr){
            arrayList.add(x);
        }

        HashSet<Integer> hashSet = new HashSet<>(arrayList);
        if(arrayList.size() == hashSet.size()){
                answer = "U";
        }else{
            return "D";
        }
        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(N, arr));
    }
}
