class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i=0; i< sides.length; i++){
            answer += sides[i];
            if(sides[i] > max){
                max = sides[i];
                maxIndex = i;
            }
        }

        if( answer-sides[maxIndex] > max){
            answer = 1;
        }else{
            answer = 2;
        }
        
        return answer;
    }
}
