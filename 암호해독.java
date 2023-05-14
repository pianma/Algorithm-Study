class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        char[] ch = cipher.toCharArray();
 
        for(int i=code-1; i<ch.length;){
            answer += ch[i];
            i += code;
        }
        
        return answer;
    }
}
