import java.util.*;

public class dish {
    public static int ways(int k,String s){
        if(k>s.length())
          return 0;
        ArrayList<Character> li=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(! li.contains(s.charAt(i)))
                li.add(s.charAt(i));
        }
        if(li.size()<k)
          return 0;
        else
          return s.length();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k=in.nextInt();
        String s=in.next();
        System.out.println(ways(k, s));
    }
}
