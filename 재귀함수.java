class Main {

    public  void DFS(int n) {
        if (n==0) return;
        DFS(n-1);
        System.out.println(n + " ");
    }


    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(3);

    }
}
