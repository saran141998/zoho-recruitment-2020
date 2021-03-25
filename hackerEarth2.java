import java.util.Scanner;

public class hackerEarth2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int rem=n%12;
            switch (rem){
                case 0:
                    System.out.print(n-11+" WS");
                    break;
                case 1:
                    System.out.print(n+11+" WS");
                    break;
                case 2:
                    System.out.print(n+9+" MS");
                    break;
                case 3:
                    System.out.print(n+7+" AS");
                    break;
                case 4:
                    System.out.print(n+5+" AS");
                    break;
                case 5:
                    System.out.print(n+3+" MS");
                    break;
                case 6:
                    System.out.print(n+1+" WS");
                    break;
                case 7:
                    System.out.print(n-1+" WS");
                    break;
                case 8:
                    System.out.print(n-3+" MS");
                    break;
                case 9:
                    System.out.print(n-5+" AS");
                    break;
                case 10:
                    System.out.print(n-7+" AS");
                    break;
                case 11:
                    System.out.print(n-9+" MS");
                    break;
            }

        }


    }
}
