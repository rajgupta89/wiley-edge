import java.util.*;
class triplet {
    public static int pair(int n,int[] a){
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n-1; j++) {
                if(a[i]<a[j])
                 break;
            }
            for (int j = 0; j < a.length; j++) {
                
            }
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
