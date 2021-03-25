import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class postFix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        ArrayList al=new ArrayList();
        String str=sc.next();
        zohoStack zs=new zohoStack();
        int index=0,index1=1;
        //Stack<Integer> zs=new Stack<>();
        for (int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                zs.push(c-'0');
            }
            else {
                int val1=zs.pop(index++);
                int val2=zs.pop(index1++);
                switch (c){
                    case '+':
                        int ci= zs.push(val1+val2);
                        index=ci;
                        break;
                    case '-':
                        int c2= zs.push(val1-val2);
                        index=c2;
                        break;
                    case '*':
                        int c3=zs.push(val1*val2);
                        index=c3;
                        break;
                    case '/':
                       int c4= zs.push(val1/val2);
                       index=c4;
                        break;
                }
            }
        }

        System.out.print(zs.peek());
    }
}
