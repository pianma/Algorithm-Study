import java.util.*;

class Solution {
     public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] ch = my_string.toCharArray();
        char[] ch2 = overwrite_string.toCharArray();
        int num = 0;

        for(int i = 0; i<overwrite_string.length(); i++){
            ch[s] = ch2[num];
            num++;
            s++;

        }

        for(char x : ch){
            answer += x;
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();

        System.out.println(T.solution(my_string, overwrite_string, s));

    }
}
