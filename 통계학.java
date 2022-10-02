import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        double N1 =0;
        int N2 =0;
    
        int N4 =0;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            N1 += a[i];
        }

        N1 = Math.round( N1/n);
        Arrays.sort(a);
        N2 = a[n/2];
        N4 = a[n-1]-a[0];



        int count = 0;
		int max = -1;
		
		int N3 = a[0];
	
		boolean check = false;
		for(int i = 0; i < n - 1; i++) {
			if(a[i] == a[i + 1]) {
				count++;
			}else {
				count = 0;
			}
			
			if(max < count) {
				max = count;
				N3 = a[i];
				check = true;
			}else if(max == count && check == true) {
				N3 = a[i];
				check = false;
			}
		}
        System.out.println("==");
        System.out.println(N1);
        System.out.println(N2);
        System.out.println(N3);
        System.out.println(N4);
        
    }
}
