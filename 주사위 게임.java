import java.util.*;
class Solution {
   public int solution(int a, int b, int c, int d) {
        int[] arr = {a,b,c,d};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(a, hashMap.getOrDefault(a, 0)+1);
        hashMap.put(b, hashMap.getOrDefault(b, 0)+1);
        hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        hashMap.put(d, hashMap.getOrDefault(d, 0)+1);
        List<Integer> keys = new ArrayList<>(hashMap.keySet());

        switch (hashMap.size()){
            case 1:
                return 1111*a;
            case 2:
                if (hashMap.get(keys.get(0)) == 1 ||  hashMap.get(keys.get(1)) == 1){
                    int p = hashMap.get(keys.get(0)) == 3 ? keys.get(0) : keys.get(1);
                    int q = hashMap.get(keys.get(0)) == 1 ? keys.get(0) : keys.get(1);
                    return (int)Math.pow((10*p)+q,2);
                }else{
                    return (keys.get(0) + keys.get(1)) * Math.abs(keys.get(0) - keys.get(1));
                }
            case 3:
                int result = 0;
                for(Integer x: hashMap.keySet()){
                    if(hashMap.get(x) !=2){
                        if (result == 0){
                            result = x;
                        }else{
                            return result * x;
                        }
                    }
                }
            case 4:
                return  Math.min(Math.min(Math.min(a,b),c),d);
        }

        return -1;
    }
}
