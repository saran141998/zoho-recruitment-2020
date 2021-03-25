import java.util.Random;
import java.util.Scanner;

public class isLand {
    static boolean visited[][];
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random r=new Random(1123);
        int m=sc.nextInt(),count=0;
        int a[][]=new int[m][m];
        visited=new boolean[m][m];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                a[i][j]=r.nextInt(10)%2;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if(a[i][j]==1 && visited[i][j]!=true){
                    count++;
                    group(a,i,j);
                }
            }
        }
        System.out.println(count);
    }

    private static void group(int[][] a, int i, int j) {
        if(i>=0 && j>=0 && i<a.length && j<a.length){
            if(a[i][j]==1 && visited[i][j]!=true){
                visited[i][j]=true;
                group(a,i-1,j-1);
                group(a,i-1,j);
                group(a,i-1,j+1);
                group(a,i,j-1);
                group(a,i,j+1);
                group(a,i+1,j-1);
                group(a,i+1,j);
                group(a,i+1,j+1);
            }
        }
    }
}
