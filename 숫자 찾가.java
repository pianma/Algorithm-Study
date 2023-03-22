class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String str = Integer.toString(num);

        if(str.indexOf(Integer.toString(k)) >= 0){
            answer = str.indexOf(Integer.toString(k))+1;
        }else{
            answer = -1;
        }
        
        return answer;
    }
}
