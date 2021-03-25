import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Random r=new Random(1123);
        int a[]=new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=r.nextInt(10)%2;
        }
        System.out.println("Array before modifying:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        seggregate(a,n);
    }

    private static void seggregate(int[] a, int n) {
        int c=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
                c++;
        }
        for (int i=0;i<c;i++){
            a[i]=0;
        }
        for(int i=c;i<n;i++)
            a[i]=1;
        System.out.println("Array before modifying:");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
