import java.io.*;
import java.util.*;

public class StringCompression {

	public static String compression1(String str){
		// write your code here
		String s = str.charAt(0) + "";
		for(int i = 1; i < str.length(); i++){
		    char curr = str.charAt(i);
		    char prev = str.charAt(i - 1);
		
		    if(curr != prev){
		    s += curr;  
		}
		}

		return s;
	}

	public static String compression2(String str){
		// write your code here
        String s = str.charAt(0) + "";
        int count = 1;
        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            
            if(curr == prev){
                count++;
            } else{
                if(count > 1){
                    s += count;
                    count = 1;
                
                }
                s += curr;
            }
        }
            
            if(count > 1){
                s += count;
                count = 1;
            }
		return s;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}



// import java.util.*;

// public class StringCompression {
//     public static void removeDuplicates(String str) {
//        if (str.length()==0)
//        return;
       
//        int n = str.length();
//        String ans = str.charAt(0) + "";

//        int i = 1;
//        int changes = 0;
//        while(i<n){
//            while(i<n && ans.charAt(ans.length()-1) == str.charAt(i))
//            i++;

//            changes++;
//            if(i<n)
//            ans += str.charAt(i);
//            i++;
//        }
//        System.out.println(ans);
    
//     }


//     public static void removeDuplicatesInsertCount(String str) {
//         if (str.length()==0)
//         return;
        
//         int n = str.length();
//         String ans = str.charAt(0) + "";
 
//         int i = 1;
//         int changes = 0, count = 0;
//         while(i<n){
//             count = 1;
//             while(i<n && ans.charAt(ans.length()-1) == str.charAt(i)){

//             i++;
//             count++;
//             }
 
//             changes++;
//             if(count>1)
//             ans+=count;
//             if(i<n)
//             ans += str.charAt(i);
//             i++;
//         }
//         System.out.println(ans);
     
//      }

    

//     public static void main(String[] args) {
        
//         String str = "aaaaaaaabbbbbbbccccddddefggghh";
//         removeDuplicates(str);
//         removeDuplicatesInsertCount(str);
//     }

// }

