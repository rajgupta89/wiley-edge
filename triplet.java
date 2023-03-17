import java.util.*;
class triplet {
    public static int pair(int n,int[] a){
        for (int i = 0; i < n-2; i++) {
            if(a[i]<a[i+1] && a[i+1]<a[i+2])
             return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        System.out.println(pair(n, a));
    }    
}
