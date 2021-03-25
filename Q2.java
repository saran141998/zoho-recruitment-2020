import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(findFreq(arr));
    }

    private static int findFreq(int[] arr) {
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        for (int i=0;i<arr.length;i++){
            int k=arr[i];
            if(m.containsKey(k)){
                int f=m.get(k);
                f++;
                m.put(k,f);
            }
            else {
                m.put(k,-1);
            }
        }
        int mc=0,res=-1;
        for(Map.Entry<Integer,Integer> val:m.entrySet()){
            if(mc<val.getValue()){
                res= val.getKey();
                mc=val.getValue();
            }
        }
        return res;
    }
}
