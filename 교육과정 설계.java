import java.util.*;

class Main {

    public String solution(String essential, String str) {
        String answer = "YES";



        Queue<Character> Q = new LinkedList<>();

        for(char x : essential.toCharArray())
            Q.add(x);
        for(char x : str.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll())
                    return "NO";
            }
        }
        if(!Q.isEmpty())
            return "NO";

        return answer;

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        String essential = sc.next();
        String str = sc.next();

        System.out.println(T.solution(essential, str));

    }
}
