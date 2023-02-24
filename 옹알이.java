import java.util.ArrayList;
import java.util.List;
class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        
       
        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < babbling.length; i++) {

            String[] temp = babbling[i].split("aya|ye|woo|ma");

            list.add(temp);
        }
        
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length == 0){
                count++;
            }     
        }
        return count;
    }
}
