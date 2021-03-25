import java.util.*;

public class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortBygroup(arr,k);
    }

    private static void sortBygroup(int[] arr, int k) {

        ArrayList al=new ArrayList();
        TreeMap<Integer,Integer> m=new TreeMap<Integer,Integer>();
        String str=" ";
        for (int i=0;i<arr.length;i=i+k){
            str="";
            for(int j=i;j<i+k;j++){
                str+=String.valueOf(arr[j]);
            }
            m.put(Integer.parseInt(str),i);
        }

//        ArrayList al1=new ArrayList();
//        for(int i=0;i<(arr.length/k);i++){
//            int index= m.get();
//            int ind=index%10;
//            for (int j=0;j<k;j++){
//                al1.add(arr[ind++]);
//            }
//        }
        for(Map.Entry<Integer,Integer> val:m.entrySet()){

            int index=val.getValue();
            for (int i=0;i<k;++i){
                al.add(arr[index++]);
            }
        }
        System.out.print(al);
    }
}
