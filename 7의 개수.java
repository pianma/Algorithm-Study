import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        ArrayList<String> stringArrayList = new ArrayList<>();
        
           for(int x : array){
               
            stringArrayList.add(Integer.toString(x));
               
             }
        
           for(String x : stringArrayList){
            char[] ch =  x.toCharArray();
            for (char y : ch){
                if(y == '7'){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
