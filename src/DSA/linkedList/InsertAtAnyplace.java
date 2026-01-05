package DSA.linkedList;

class CountNode{
    int data;
    CountNode next;

    private CountNode(int data){
        this.data = data;
        this.next = null;
    }

    static class LinkedList2 {
        CountNode head;

        void insertAtGivenFunction(int data, int position){
            CountNode newNode = new CountNode(data); //Created a New node

            //If adding  a new node on the head position
            if(position <= 1){
                newNode.next = head;
                head = newNode;
                return;
            }

            //If adding new node at the middle of the Linked List
            // Find the predecessor node (position - 1)
            CountNode pred = head; //This Line is cuz the traversal in linked list will start from the head
            int currentPosition = 1;
            while(pred != null && currentPosition < position - 1){
                pred = pred.next;
                currentPosition++;
            }

            //Checking if the entered position is wright/wrong
            if (pred == null){
                System.out.println("Position Out of Bound");
                return;
            }

            //Insert New node after the predecessor
            newNode.next = pred.next;
            pred.next = newNode;

        }

        public void Display(){
            CountNode temp = head;
            while(temp != null){
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println("Null");
        }
    }

}

public class InsertAtAnyplace {
    public static void main(String[] args) {
        CountNode.LinkedList2 list1 = new CountNode.LinkedList2();

        list1.insertAtGivenFunction(850, 0);
        list1.insertAtGivenFunction(78, 1);
        list1.insertAtGivenFunction(302, 2);
        list1.insertAtGivenFunction(32, 3);
        list1.insertAtGivenFunction(33, 4);

        list1.insertAtGivenFunction(34, 3);

        list1.Display();
    }
}