import java.util.Scanner;

public class snakePattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=sc.nextInt();
        int num=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(2*n)-i;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else if(i%2==1){
                    num++;
                    System.out.print(num+" ");
                }
                else {
                    System.out.print(num+" ");
                    num--;
                }
            }
            num+=n;
            System.out.println();
        }
    }
}
