package DSA.linkedList;

class countNode{
    int data;
    countNode next;

    public countNode(int data) {
        this.data = data;
        this.next = null;
    }

    static class LinkedList1{
        countNode head;

        //Adding new node at the end
        public void insertLinkList(int data){
            countNode newNode = new countNode(data);
            if(head == null){
                head = newNode;
                return;
            }

            countNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }

        public int count(){
            countNode temp = head;
            int count = 0;
            while (temp != null){
                temp = temp.next;
                count++;
            }
            return count;
        }

        public void display(){
            countNode temp = head; //start at the first coach

            //Keep  moving until there are no more coaches
            while(temp!=null){
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("Null");
        }

    }
}
public class CountLinkedList {
    public static void main(String[] args){
        countNode.LinkedList1 list1 = new countNode.LinkedList1();

        list1.insertLinkList(789);
        list1.insertLinkList(256);
        list1.insertLinkList(85);
        list1.insertLinkList(9678);

        list1.display();
        System.out.println("Total Nodes of this Linked List: " + list1.count());

    }
}