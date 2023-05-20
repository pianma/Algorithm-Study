import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        Arrays.sort(array);
        
        int max = Integer.MAX_VALUE;
        int maxIndex = 0;

        for(int i=0; i< array.length; i++){
           int a = Math.abs(array[i] - n);
           if(a<max){
              max = a;
              maxIndex = i;
              answer= array[maxIndex];
           }
        }
        
        return answer;
    }
}
