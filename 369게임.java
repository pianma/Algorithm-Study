class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String str = Integer.toString(order);
        char[] ch = str.toCharArray();
        for(char x : ch){
            if(x=='3' || x=='6' || x=='9'){
                answer++;
            }
        }
        
        return answer;
    }
}
