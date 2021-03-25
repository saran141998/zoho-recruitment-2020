import java.util.Scanner;

public class Q9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int totalNumbers=n*n;
        int l=-c;
        int f=1;
       for (int i=1;i<=n;i++){
           for (int j=1;j<=n;j++){
               if(j==c){
                   System.out.print(i*j-j+i+" ");
               }
               else if(j>c){
                   System.out.print(i+j+l+" ");
                   l=l+c;
               }
               else {
                   System.out.print(i+j+f+" ");

               }
           }
           f=f+c;
           System.out.println();
       }
    }
}
