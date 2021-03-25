import java.util.Scanner;

public class Q8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
       int res= mxSubArraySum(a);
        System.out.print(res);
    }

    private static int mxSubArraySum(int[] a) {
        int n=a.length;
        int mk=findMax(a);//12
        int max_w=0;
        for (int i=0;i<n;i++){
            max_w+=a[i];   //11
            a[i]=-a[i];
        }
        max_w=max_w+findMax(a); //11
        return (max_w>mk)?max_w:mk;
    }

    private static int findMax(int[] a) {
        int n=a.length;
        int max=0,curmax=0;
        for(int i=0;i<n;i++){
            curmax=curmax+a[i];
            if(curmax<0)
                curmax=0;
            if(max<curmax)
                max=curmax;
        }
        return max;
    }
}
//12 +10  -8 -9 +8 +9