import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        
        String[] ArrayStr = str.split(" ");

        int max = 0;
        int tmp = 1;
        for (int i = 0; i < ArrayStr.length; i++) {
            if(ArrayStr[i].length() > max){
                max = ArrayStr[i].length();
                tmp = i;
                
            }
        }
        System.out.println(ArrayStr[tmp]);

    }

}
