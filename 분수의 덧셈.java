class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int max=0;
        for(int i=1; i<=denom1 && i<=denom2; i++){
            if (denom1%i==0 && denom2%i==0){
                max =i;
            }
        }
        answer[1] = (denom1*denom2)/max;
        answer[0] =  numer2*(denom1/max) + numer1*(denom2/max);
        
        for(int i=1; i<=answer[1] && i<=answer[0]; i++){
            if (answer[1]%i==0 && answer[0]%i==0){
                max =i;
            }
        }
        
        answer[1] = answer[1]/max;
        answer[0] = answer[0]/max;
        
        return answer;
    }
}
