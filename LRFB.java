import java.util.ArrayList;
import java.util.Scanner;

public class LRFB {
    public static void main(String[] args) {
        boolean stop = false;
        Scanner in = new Scanner(System.in);
        int choice = -1;
        CustomStack pathFinder = new CustomStack();
        ArrayList < Directions > input = new ArrayList < > ();
        try {
            while (!stop) {
                System.out.println("Choose an option:");
                System.out.println("1 for Left");
                System.out.println("2 for Right");
                System.out.println("3 for Forward");
                System.out.println("4 for Backward");
                System.out.println("5 to stop input");
                choice = in .nextInt();
                switch (choice) {
                    case 1:
                        input.add(Directions.LEFT);
                        break;
                    case 2:
                        input.add(Directions.RIGHT);
                        break;
                    case 3:
                        input.add(Directions.FORWARD);
                        break;
                    case 4:
                        input.add(Directions.BACKWARD);
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
            for(Directions direction : input) {
                pathFinder.checkAndPush(direction);
            }
            System.out.println("Final Path:");
            System.out.println(pathFinder.finalPath());
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            in .close();
        }
    }
}