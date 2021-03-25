import java.util.Scanner;

public class Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printMaxInAllSubArrays(arr,k);
    }

    private static void printMaxInAllSubArrays(int[] arr,int k) {
        int j,max;
        for(int i=0;i<=arr.length-k;i++){
            max=arr[i];
            for(j=1;j<k;j++){
                if(arr[i+j]>max)
                    max=arr[i+j];
            }
            System.out.print(max+" ");
        }
    }
}
