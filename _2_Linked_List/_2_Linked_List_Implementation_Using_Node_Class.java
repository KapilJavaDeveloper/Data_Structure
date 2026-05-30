class Node{
    int data ;
    Node next ;

    public Node(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _2_Linked_List_Implementation_Using_Node_Class {
    public static void main(String [] args){
        System.out.println("Linked List Implementation Using Node Class") ;

        Node obj1 = new Node(1) ;
        Node obj2 = new Node(2) ;
        Node obj3 = new Node(3) ;

        obj1.next = obj2 ;
        obj2.next = obj3 ;

        Node head = obj1 ;
        
        System.out.println("Linked List be: ") ;

        while(head !=null){
            System.out.print(head.data + " ") ;
            head = head.next ;
        }

    }
    
}


