package DSA.linkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedListFunction{
    Node head; //first node of the list

    //Add a new node at the end
    public void insert(int data){
        Node newNode = new Node (data);

        if(head == null){
            head = newNode;
            return;
        }

        Node temp = head; //I f the train has no coach make a new one


        //otherwise, start at the first coach and thd keep moving until you reach the last one.
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode; //Link new node  at the end
    }
    public void display(){
        Node temp = head; //start at the first coach

        //Keep  moving until there are no more coaches
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
}

public class LinkedList{
    public static void main(String[] args){
        LinkedListFunction list = new LinkedListFunction(); //Created a new Empty train

        //entered the data in Linked list
        list.insert(190);
        list.insert(223);
        list.insert(111);
        list.insert(896);
        list.insert(456);
        list.insert(45);

        //displaying the data of linked list
        System.out.println("Linked List: ");
        list.display();
    }

}

