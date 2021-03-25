import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class lfrbusingJavaStack {
   public static Stack s=new Stack<>();
    public static void checkThenPush(String str){
        if(s.isEmpty()){
            s.push(str);
        }
        else{
           switch (str){
               case "LEFT": {
                   if (s.peek() == "RIGHT") { //Checking if top value is opposite
                       s.pop(); //Removing the opposite direction to cancel each other
                   } else {
                       s.push(str);
                   }
                   break;
               }
               case "RIGHT": {
                   if ( s.peek() =="LEFT") { //Checking if top value is opposite
                       s.pop(); //Removing the opposite direction to cancel each other
                   } else {
                       s.push(str);
                   }
                   break;
               }
               case "FORWARD": {
                   if (s.peek() == "BACKWARD") { //Checking if top value is opposite
                       s.pop(); //Removing the opposite direction to cancel each other
                   } else {
                       s.push(str);
                   }
                   break;
               }
               case "BACKWARD": {
                   if (s.peek() == "FORWARD") { //Checking if top value is opposite
                       s.pop(); //Removing the opposite direction to cancel each other
                   } else {
                       s.push(str);
                   }
                   break;
               }

           }
        }

        }


    public static void printStack(){
        System.out.print(s);
    }
    public static void main(String args[]){

        ArrayList<String> input=new ArrayList();
        Scanner in = new Scanner(System.in);
        int choice = -1;
        boolean stop=false;
        while (!stop) {
            System.out.println("Choose an option:");
            System.out.println("1 for Left");
            System.out.println("2 for Right");
            System.out.println("3 for Forward");
            System.out.println("4 for Backward");
            System.out.println("5 to stop input");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    input.add("LEFT");
                    break;
                case 2:
                    input.add("RIGHT");
                    break;
                case 3:
                    input.add("FORWARD");
                    break;
                case 4:
                    input.add("BACKWARD");
                    break;
                case 5:
                    stop = true;
                    break;
                default:
                    System.out.println("Invalid input");

            }

        }
        System.out.println("Input Path:");
        System.out.println(input.toString());
        for(int i=0;i<input.size();i++){
            checkThenPush(input.get(i));
        }
        System.out.println("Final path:");
        printStack();
    }
}
