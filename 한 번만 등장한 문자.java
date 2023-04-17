import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int a = 0;
        for(int i=0; i<ch.length; i++){
            int count = 0;
            for(int j=0; j<ch.length; j++){
                count++;
                if(ch[i]==ch[j]){
                    if (i!=j){
                        count = 0;
                        a++;
                        break;
                    }
                }
                if(j == ch.length-1 && count>0){
                    answer += ch[i];
                }
            }
        }
        
        return answer;
    }
}
