import java.util.StringJoiner;

public class BinarySearchTree {
    private class Node
    {
        int value;
        Node left, right;
        Node(int d)
        {
            value = d;
            left = right = null;
        }
    }

    Node root;

    public Node insertInBST(Node currentNode, int value){
        //if empty tree return new node
        if(currentNode == null){
            return new Node(value);
        }

        else if(value > currentNode.value){
            currentNode.right = insertInBST(currentNode.right, value);
        }
        else if (value < currentNode.value) {
            currentNode.left = insertInBST(currentNode.left, value);
        }
        else{
            return currentNode;
        }
        return currentNode;
    }

    public void add(int n){
        root = insertInBST(root, n);
    }

    public void deleteKey(int key){
        root = deleteRecursive(root, key);
    }
    public Node deleteRecursive(Node current, int value){
        if(current ==  null){
            return current;
        }
        if(value < current.value){
            current.left = deleteRecursive(current.left, value);
        }
        else if(value>current.value){
            current.right = deleteRecursive(current.right, value);
        }
        else{
            if(current.left == null){
                return current.right;
            }
            else if(current.right == null){
                return current.left;
            }
            current.value = findMinValue(current.right);
            current.right = deleteRecursive(current.right, current.value);
        }

        return current;
    }

    int findMinValue(Node current){
        int minValue = current.value;
        while (current.left!=null){
            minValue = current.left.value;
            current = current.left;
        }

        return minValue;
    }

    boolean search(Node current, int x) {
        if (current == null){
            return false;
        }
        if(current.value == x){
            return true;
        }
        else if(x<current.value){
            return search(current.left, x);
        }
        return search(current.right, x);

    }

    void inOrderPrint(Node node){
        if(node == null){
            return;
        }
        inOrderPrint(node.left);
        System.out.println(node.value);
        inOrderPrint((node.right));
    }

    String toStringInOrder(Node node){
        StringJoiner line = new StringJoiner(" ", "", "");
        toStringInOrderRecursive(node, line);
        return line.toString();
    }

    void toStringInOrderRecursive(Node node, StringJoiner line){
        if(node == null){
            return;
        }
        toStringInOrderRecursive(node.left, line);
        line.add(Integer.toString(node.value));
        toStringInOrderRecursive(node.right, line);
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int input[] = {12,5,3,18,16,36, 1};

        for(int value: input){
            bst.add(value);
        }
        System.out.println(bst.search(bst.root, 5));
        System.out.println(bst.toStringInOrder(bst.root));


    }
}
