class Solution {
   public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int Result = 0;
        int left = 0;
        int right = 0;

        for(int i=0; i< quiz.length; i++){
            String[] arr = quiz[i].split(" ");
            if (arr[1].equals("+")){
               if (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])){
                   answer[i] = "O";
               }else{
                   answer[i] = "X";
               }
            }else{
                if (Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]) == Integer.parseInt(arr[4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}
