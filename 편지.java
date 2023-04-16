class Solution {
    public int solution(String message) {
        int answer = 0;
        
        char[] ch = message.toCharArray();
        answer = (ch.length)*2;
        
        return answer;
    }
}
