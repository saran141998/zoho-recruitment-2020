import java.util.Scanner;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rotateArray(arr,k);
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void rotateArray(int[] arr, int k) {
        for (int i=0;i<k;i++){
            leftRotate(arr,arr.length);
        }
    }

    private static void leftRotate(int[] arr, int length) {
        int i,t;
        t=arr[0];
        for(i=0;i<length-1;i++)
            arr[i]=arr[i+1];

        arr[length-1]=t;

    }
}
