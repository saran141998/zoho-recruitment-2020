import javax.crypto.MacSpi;
import java.util.Scanner;

public class checkDuplicates {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size=sc.nextInt();
        int[] num=new int[size];
        int[] temp=new int[num.length];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int visited=-1;
        for (int i=0;i<size;i++){
            int count=1;
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    count++;
                    temp[j]=visited;
                }
            }
            if(temp[i]!=visited){
                temp[i]=count;
            }
        }
        for(int i=0;i<num.length;i++){
            if(temp[i]!=visited &&temp[i]>1){
                System.out.print(num[i]+"->"+temp[i]);
                System.out.println();
            }

        }
    }
}
