import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    static ArrayList<Integer>[] A;
  static boolean visited[];
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    A = new ArrayList[n + 1];
    visited = new boolean[n + 1];
    for (int i = 1; i < n + 1; i++) {
      A[i] = new ArrayList<Integer>();
    }
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(st.nextToken());
      int e = Integer.parseInt(st.nextToken());
      A[s].add(e); 
      A[e].add(s);
    }
    int count = 0;
    for (int i = 1; i < n + 1; i++) {
      if (!visited[i]) { 
        count++;
        DFS(i);
      }
    }
    System.out.println(count);
  }
  static void DFS(int v) {
    if (visited[v]) {
      return;
    }
    visited[v] = true;
    for (int i : A[v]) {
      if (visited[i] == false) { 
        DFS(i);
            }
        }
    }
}




//복습
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {
    static ArrayList<Integer>[] A;
    static boolean[] visited;
    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count =0;

        
     visited = new boolean[n + 1];
        A= new ArrayList[n+1];

        for(int i=1; i<n+1; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++){
            int a= sc.nextInt();
            int b= sc.nextInt();

            A[i].add(a);
            A[i].add(b);
        }

        for(int i=1; i<n+1; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }
    private static void DFS(int v) {
        if(visited[v]){
            return;
        }

        visited[v] = true;

        for(int i: A[v]){
            if(visited[i]==false){
                DFS(i);
            }
        }
    }
}
