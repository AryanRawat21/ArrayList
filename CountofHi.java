import java.util.*;

public class CountofHi {
    public static int Count(String str) {
        int n = str.length();
        int i = 0,count=0;
        
        while (i < n-1) {
                if(str.charAt(i) == 'h'&& str.charAt(i+1)=='i'){
                        count++;
                        i+=2;

                }else
                i++;
            }
            
        return count;
    }

    

    public static void main(String[] args) {
        
        String str = "hihihihiihiii iihihi hihi";
        System.out.println(Count(str));
    }

}