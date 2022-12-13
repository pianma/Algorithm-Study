import java.util.*;

class Main {

    public int solution(String str, String str2) {
        int answer = 0;
        int start = 0;

        while(start<=str.length()-str2.length()) {



            String strSub = str.substring(start, start+str2.length());
            start++;


            strSub.toLowerCase();
            str2.toLowerCase();

            char[] x = strSub.toCharArray();
            char[] y = str2.toCharArray();

            Arrays.sort(x);
            Arrays.sort(y);


            if(Arrays.equals(x,y)){
                answer++;

            }

        }
        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();

        System.out.println(T.solution(str, str2));
    }
}
