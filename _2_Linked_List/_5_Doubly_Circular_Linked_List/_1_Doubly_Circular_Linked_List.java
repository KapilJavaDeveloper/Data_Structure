// package _5_Doubly_Linked_List;

class Node{
    int data ;
    Node prev ;
    Node next ;

    public Node(int data){
        this.data = data ;
    }
}
public class _1_Doubly_Circular_Linked_List {
    public static void main(String [] args){
        
        Node obj1 = new Node(1);
        Node obj2 = new Node(2);
        Node obj3 = new Node(3);
        Node obj4 = new Node(4);
        Node obj5 = new Node(5);

        obj1.prev = obj5 ;
        obj1.next = obj2 ;

        obj2.prev = obj1 ;
        obj2.next = obj3;

        obj3.prev = obj2 ;
        obj3.next = obj4 ;

        obj4.prev = obj3 ;
        obj4.next = obj5 ;

        obj5.prev = obj4 ;
        obj5.next = obj1 ;

        Node temp = obj1 ;

        System.out.println("Doubly Linked List be") ;
       

        do{
            System.out.print(temp.data + " ") ;
            temp = temp.next ;
        }while(temp !=obj1) ;


    }
    
}
