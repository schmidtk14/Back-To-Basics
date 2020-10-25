public class LinkedList {


    class Node{
        int data;
        Node next;
        Node (int d){
            data = d;
        }
    }
    Node head;


    void push(int value){
        if(head == null){
            head = new Node(value);
        }
        else{
            Node newHead = new Node(value);
            Node newNext = head;
            head = newHead;
            head.next = newNext;
        }
    }

    void append(int value){

        if(head== null){
            head = new Node(value);
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new Node(value);
    }

    String toString(Node head){
        String resultString = "";
        if(head!=null){
            Node currentNode = head;
            while(currentNode.next!=null){
                resultString += Integer.toString(currentNode.data)+ " ";
                currentNode = currentNode.next;
            }
            resultString += Integer.toString(currentNode.data);
        }
        return resultString;
    }

    int getValueAtIndex(Node head, int index){
        Node currentNode = head;
        for(int i=0; i<index; i++){
            if(currentNode.next == null){
                System.out.println("index out of range of list");
                break;
            }
            else{
                currentNode = currentNode.next;
            }
        }
        return currentNode.data;
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        int[] input = {1,2,3,4,5,6,7};
        for(int value: input){
            list.append(value);
        }
        System.out.println(list.toString(list.head));
        list.append(0);
        System.out.println(list.toString(list.head));
        System.out.println(list.getValueAtIndex(list.head,15));
    }
}
