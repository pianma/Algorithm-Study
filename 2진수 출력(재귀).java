class Main {

    public  void DFS(int n) {
        if (n==0) return;
        DFS(n/2);
        System.out.println(n%2 + " ");
    }


    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(11);

    }
}
