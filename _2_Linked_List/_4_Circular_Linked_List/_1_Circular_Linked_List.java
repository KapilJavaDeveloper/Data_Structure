// package _4_Circular_Linked_List;

class Node{
    int data ;
    Node next ;

    public Node(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _1_Circular_Linked_List {
    public static void main(String [] args){
        System.out.println("Circular Linked List") ;

        Node obj1 = new Node(1);
        Node obj2 = new Node(2);
        Node obj3 = new Node(3);
        Node obj4 = new Node(4);
        Node obj5 = new Node(5);

        obj1.next = obj2 ;
        obj2.next = obj3 ;
        obj3.next = obj4 ;
        obj4.next = obj5 ;

        obj5.next = obj1 ;

        Node temp = obj1 ;

        while(temp.next != obj1){
            System.out.print(temp.data + " ") ;
            temp = temp.next ;
        }


    }
    
}
