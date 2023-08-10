import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    static int n, m = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v]= 1;
        dis[v]=0;
        queue.offer(v);
        while (!queue.isEmpty()){
            int cv=queue.poll();
            for(int x: graph.get(cv)){
                if (ch[x]==0){
                    ch[x]=1;
                    queue.offer(x);
                    dis[x]=dis[x]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();

        for (int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];
        dis = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        T.BFS(1);
        for (int i=2; i<=n; i++){
            System.out.println(i + " : " + dis[i]);
        }
    }
}
