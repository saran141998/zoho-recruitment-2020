import java.util.Scanner;

public class Q6_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s="CODE";
        int index=0;
        char[] characters=s.toCharArray();
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i==0){
                    System.out.print(characters[j]);
                }if(i!=0 && i!=s.length()-1){
                    System.out.print(characters[i]);
                }
                if(i==s.length()-1){
                    System.out.print(characters[s.length()-1]);
                }

                else{
                    System.out.print(" ");
                }

            }
            System.out.println();                      //2nd row star o end d=====> CODE

        }
    }
}
