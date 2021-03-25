import java.util.Scanner;

public class Feb25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        };
        arr = removeDuplicates(0, arr, new boolean[size]);
        System.out.print("Final Array is: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int[] removeDuplicates(int index, int[] array, boolean[] modifiedAlready) {

        if(index > array.length - 1) {
            return array;
        }
        boolean duplicateExists = false;
        for(int i = 0; i< array.length; i++) {
            if(i==index)
                continue;;
            if(array[index] == array[i]) {
                duplicateExists = true;
                break;
            }
        }
        if(!duplicateExists) {
            return removeDuplicates(index + 1, array, modifiedAlready);
        }
        array[index] = modifiedAlready[index] ? (array[index] + 1) : index;
        modifiedAlready[index] = true;
        return removeDuplicates(index, array, modifiedAlready);
    }
}
