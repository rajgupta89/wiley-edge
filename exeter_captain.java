import java.util.*;

class exeter_captain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name1=in.next();
        String name2=in.next();
        int count=0, count1=0;
        if(name1.length()==name2.length()){
            for(int i=0;i<name1.length();i++){
                if((name1.charAt(i)!='?' && name2.charAt(i)!='?') && (name1.charAt(i)!=name2.charAt(i)))
                    count++;
            }
            for (int i = 0; i < name1.length(); i++) {
                if(name1.charAt(i)=='?' || name2.charAt(i)=='?')
                  count1++;
            }
        }
        count1=count1+count;
        System.out.println(count+" "+count1);
    }
}
