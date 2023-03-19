class Solution {
    public int solution(int n) {
        int answer = 0;
        
        char[] ch = Integer.toString(n).toCharArray();
        int[] arr = new int[ch.length];

        for(int i=0; i<ch.length; i++){
            arr[i] = ch[i] - '0';
        }

        for(int x: arr){
          answer += x;
        }

        
        return answer;
    }
}
