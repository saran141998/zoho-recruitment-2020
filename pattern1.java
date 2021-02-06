import java.util.Scanner;

public class pattern1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int temp=0;
        System.out.println("Enter number of rows");
        int rows=sc.nextInt();
        for (int i=rows;i>=1;i--){
          for (int j=rows;j>=i;j--){
              System.out.print(j+" ");
              temp=j;
          }
          for(int k=rows-i+1;k<rows;k++){
              System.out.print(temp+" ");
          }

            System.out.println();
        }

    }
}
