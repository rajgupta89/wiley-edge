import java.util.*;
class robert{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int len;
        if(Character.isDigit(s.charAt(s.length()-1))){
             len=s.length()-1;
             if(s.charAt(s.length()-1)=='0'){
                 System.out.println(len);
             }
             else{
                 if(len<11)
                 System.out.println("-1");
                 else{
                 String s1="";
                 s1+=s.charAt(s.length()-1);
                 String s2=Integer.toString(len);
                 s1+=s2.charAt(1);
                 if(s1.equals(s2))
                   System.out.println(s1.charAt(1));
                 else
                   System.out.println("-1");
                 }
             }
        }
        else{
             len=s.length();
             System.out.println(len);
        }
    }
}