import java.util.Scanner;

public class ZecTheorem {
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     printFib(num);
 }

    private static void printFib(int num) {
     while (num>0){
         int f=findFib(num);
         System.out.print(f+" ");
         num=num-f;
     }
    }

    private static int findFib(int num) {
     if(num==0||num==1){
         return num;
     }
     int f1=0,f2=1,f3=1;
     while (f3<=num){
         f1=f2;
         f2=f3;
         f3=f1+f2;
     }
     return f2;
    }
}
