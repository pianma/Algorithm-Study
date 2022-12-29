import java.util.Scanner;
  
public class Main {

  public static void main(String[] args){
  
    Scanner in=new Scanner(System.in);
    
    String input = in.next();
    char[] arr = input.toCharArray();
    
    int lt = 0;
    int rt = arr.length-1;
    
    while(lt < rt) {
    	char left = arr[lt];
        char right = arr[rt];
        
   
        if(!Character.isAlphabetic(left)){
        	lt++;

        } else if( !Character.isAlphabetic(right)){
  			rt--;
        }else {
        

        	char tmp = arr[lt];
            arr[lt] = arr[rt];
            arr[rt] = tmp;
            
            lt ++;
            rt --;
        }
    }
    
    // char[]을 String 으로
    String answer = String.valueOf(arr);
    System.out.println(answer);
  }
}
