import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
         String[] str_array = my_string.split(" ");
        
        answer = Integer.parseInt(str_array[0]);
        
        for(int i = 1; i < str_array.length; i++){
            if(i%2!=0){
                if(str_array[i].equals("+")){
                    answer += Integer.parseInt(str_array[i+1]);
                } else {
                    answer -= Integer.parseInt(str_array[i+1]);
                }
            }
        }

        
        return answer;
    }
}
