import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();

        char[] ch = my_string.toCharArray();
        Arrays.sort(ch);

        for(char x : ch){
           answer += x;
        }
        
        return answer;
    }
}
