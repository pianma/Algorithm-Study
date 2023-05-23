class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
          for(int n=i; n<=j; n++){
           String a =  Integer.toString(n);
           char[] ch = a.toCharArray();
           for(char x : ch){
               if(x-'0' == k){
                   answer++;
               }
           }
        }
        
        return answer;
    }
}
