import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class test {
//   order should be maintained
//    Sample Input and Output:
//    I/P :
//    n : 15
//    s : aaabbbyybyaaycd
//
//    O/P:
//    output size : 3
//    final string : acd
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int count=0;
        ArrayList al=new ArrayList();
        System.out.println("Enter the length of the string");
        int n=sc.nextInt();
        System.out.println("Enter the String");
        String s=sc.next();
        int[] charCount=new int[26];

        for(int i=0;i<s.length();i++){
            charCount[s.charAt(i)-'a']++;
        }
        for(int i=0;i<charCount.length;i++){
            if(charCount[i]%2==1){
               System.out.print((char)(i+'a'));
            }
        }

    }
}
