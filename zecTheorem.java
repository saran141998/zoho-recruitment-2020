import java.util.Scanner;

public class zecTheorem {
    public static long nf(long n){
        if(n==0 || n==1)
            return n;
        long f1=0,f2=1,f3=1;
        while (f3<=n){
            f1=f2;
            f2=f3;
            f3=f1+f2;
        }
        return f2;
    }
    public static void printFib(long n){
        while (n>0){
            long f=nf(n);
            System.out.print(f+" ");
            n=n-f;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        long n=sc.nextInt();
        printFib(n);
    }
}
