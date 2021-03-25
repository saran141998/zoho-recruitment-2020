import java.util.Random;
import java.util.Scanner;

public class Q7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        Random r =new Random(1123);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println("output");
        zigZag(a,m,n);
    }

    private static void zigZag(int[][] a,int m,int n) {
        int row=0,col=0;
        boolean row_i=false;
        int mn=Math.min(m,n);
        for(int len=1;len<=9;++len){
            for(int i=0;i<len;++i){
                System.out.print(a[row][col]+" ");
                if(i+1==len)
                    break;
                if(row_i){
                    ++row;
                    --col;
                }else{
                    --row;
                    ++col;
                }
            }
            if(len==mn)
                break;
            if(row_i){
                ++row;
                row_i=false;
            }else{
                ++col;
                row_i=true;
            }
        }
        if(row==0){
            if(col==m-1)
                ++row;
            else
                ++col;
            row_i=true;
        }else {
            if(row==n-1)
                ++col;
            else
                ++row;
            row_i=false;
        }
        int max=Math.max(m,n)-1;
        for (int len,diag=max;diag>0;--diag){
            if(diag>mn)
                len=mn;
            else
                len=diag;
            for(int i=0;i<len;++i){
                System.out.print(a[row][col]+" ");
                if(i+1==len)
                    break;

                if(row_i){
                    ++row;
                    --col;
                }else {
                    ++col;
                    --row;
                }
            }
            if(row==0||col==m-1){
                if(col==m-1)
                    ++row;
                else
                    ++col;
                row_i=true;
            }
            else if(col==0||row==n-1){
                if(row==n-1)
                    ++col;
                else
                    ++row;
                row_i=false;
            }

        }
    }
}
