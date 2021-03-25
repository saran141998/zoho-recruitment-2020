import java.util.Scanner;

public class nextPalindrome {
    public static boolean isPalindrome(long n){
        long rem,rev=0;
        long num=n;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(n==rev) {
            return true;
        }
        else{
            return false;
        }

    }
    public static long findPalindrome(long n){
        for (long i=n+1;;i++){
            if(isPalindrome(i)){
                return i;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        long n= sc.nextInt();
       long nextPal=  findPalindrome(n);
       System.out.print(nextPal);
    }
}
