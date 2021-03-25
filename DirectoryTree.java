import java.util.ArrayList;

public class DirectoryTree {
    DirectoryNode rootNode = null;
    DirectoryNode currentNode = null;
    DirectoryNode tempNode;

    class DirectoryNode {
        String folderName;
        DirectoryNode parentNode = null;
        ArrayList<DirectoryNode> subDirectoryNodes = new ArrayList<>(0);

        public DirectoryNode(String folderName) {
            this.folderName = folderName;
            this.parentNode = currentNode;
        }

        @Deprecated
        public boolean contains(String folderName) {
            for (DirectoryNode node:
                 subDirectoryNodes) {
                if(node.folderName.equals(folderName)) {
                    return true;
                }
            }
            return false;
        }

        public DirectoryNode getNode(String folderName) {
            for (DirectoryNode node:
                    subDirectoryNodes) {
                if(node.folderName.equals(folderName)) {
                    return node;
                }
            }
            return null;

        }

        public String listNodes() {
            StringBuilder subFolders = new StringBuilder();
            if(subDirectoryNodes.size() == 0) return "No sub directory exists";
            subDirectoryNodes.forEach(folder -> subFolders.append(folder.folderName).append(" "));
            return subFolders.toString();
        }

        public String printDir() {
            String path = "";
            DirectoryNode tempNode = currentNode;
            while (tempNode.parentNode != null) {
                path = tempNode.folderName + "/" + path;
                tempNode = tempNode.parentNode;
            }
            path = "~/" + path;
            return path;
        }
    }

    public boolean makeDir(String path) {
        boolean isSuccessful = true;
        if(path.startsWith("~/")) {
            //Process from rootNode
            int i = 0;
            String[] nodes = path.substring(2).split("/");
            for(; i < nodes.length - 1; i++) {
                if(!changeDir(nodes[i])) {
                    isSuccessful = false;
                    break;
                }
            }
            path = nodes[i];
        } else {
            //Process from currentNode and path contains folderName
            if(rootNode == null) {
                //No nodes have been created
                rootNode = new DirectoryNode("~");
                currentNode = rootNode;
            }
        }
        if(isSuccessful) {
            //At targetDir, creating new folder
            currentNode.subDirectoryNodes.add(new DirectoryNode(path));
        }
        return isSuccessful;
    }

    public boolean isExist(String folderName) {
        return currentNode.getNode(folderName) != null;
    }

    public boolean changeDir(String path) {
        if(rootNode == null) {
            System.out.println("No root folder");
            return false;
        }
        if(path.startsWith("~/")) {
            //Process from rootNode
            String[] nodes = path.substring(2).split("/");
            for(String node : nodes) {
                if(!changeDir(node)) {
                    break;
                }
            }
        } else if(path.equals("..")) {
            if(currentNode.parentNode != null) {
                currentNode = currentNode.parentNode;
                return true;
            } else {
                System.out.println("Already at root folder");
                return false;
            }
        }
        tempNode = currentNode.getNode(path);
        if (tempNode == null) return false;
        currentNode = tempNode;
        return true;
    }

    public void listNodes() {
        if(rootNode == null) {
            System.out.println("No root folder");
        } else {
            System.out.println("Subfolder(s) of " + currentNode.folderName + " are: ");
            System.out.println(currentNode.listNodes());
        }
    }

    public void printWorkingDirectory() {
        if(rootNode == null) {
            System.out.println("No root folder");
        } else {
            System.out.println(currentNode.printDir());
        }
    }

}
