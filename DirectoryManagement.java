import java.util.Scanner;

public class DirectoryManagement {

    public static DirectoryTree dirSystem = new DirectoryTree();

    public static boolean isValidPath(String path) {
        if(!path.equals("~/")) {
            if(path.startsWith("~/")) {
                return path.matches("~(\\/\\w+)*");
            } else {
                return path.equals("..") || path.matches("\\w+");
            }
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Commands:\nmd - make directory\ncd - change directory\nls - print directory\nexit - exit");
        String command;
        while(!(command = in.nextLine()).equals("exit")) {
            String[] parsedCommand = command.split(" ");
            switch (parsedCommand[0]) {
                case "md":
                    if(parsedCommand.length == 2) {
                        if(!isValidPath(parsedCommand[1])) {
                            System.out.println("Invalid path");
                        } else {
                            boolean result = dirSystem.makeDir(parsedCommand[1]);
                            if (!result) {
                                System.out.println("Creating Directory failed. Check path");
                            } else {
                                System.out.println("Created directory: " + parsedCommand[1]);
                            }
                        }
                    } else
                        System.out.println("Invalid command syntax. Use md dirName (or) path");
                    break;
                case "ls":
                    dirSystem.listNodes();
                    break;
                case "pwd":
                    dirSystem.printWorkingDirectory();
                    break;
                case "cd":
                    if(parsedCommand.length == 2) {
                        if(!isValidPath(parsedCommand[1])) {
                            System.out.println("Invalid path");
                        } else {
                            boolean result = dirSystem.changeDir(parsedCommand[1]);
                            if (!result) {
                                System.out.println("Changing Directory failed. Check path");
                            } else {
                                System.out.println("Changed directory to: " + parsedCommand[1]);
                            }
                        }
                    } else
                        System.out.println("Invalid command syntax. Use cd dirName (or) path");
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
