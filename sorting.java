import java.util.*;

public class sorting {
    public static int convertStringToInt(String s){
        int num=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            num=num*10+((int)s.charAt(i)-48);
        }
        return num;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String[] strarr=new String[size];
        int[] newInt= new int[size];
        for(int i=0;i<strarr.length;i++){
            strarr[i]=sc.next();
        }
        for (int i=0;i<strarr.length;i++){
            for(int j=i+1;j<strarr.length;j++){
                int res=strarr[j].compareTo(strarr[i]);

                if(res>0){
                    String temp=strarr[i];
                    strarr[i]=strarr[j];
                    strarr[j]=temp;
                }

            }
        }
        for(int i=0;i<strarr.length;i++){
            System.out.print(strarr[i]+" ");
        }
//        for(int i=0;i<strarr.length;i++){
//           newInt[i]= convertStringToInt(strarr[i]);
//        }
//        int temp=0;
//        for(int i=0;i<newInt.length;i++){
//            for (int j=i+1;j<newInt.length;j++){
//                if(newInt[i]>newInt[j]){
//                   temp=newInt[i];
//                   newInt[i]=newInt[j];
//                   newInt[j]=temp;
//                }
//            }
//        }
//        for(int i=0;i<newInt.length;i++){
//            System.out.print(newInt[i]+" ");
//        }
    }
}
