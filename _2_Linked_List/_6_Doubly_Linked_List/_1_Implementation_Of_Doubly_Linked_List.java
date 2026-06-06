// package _2_Linked_List._6_Doubly_Linked_List;

class Node1{
    Node1 prev ;
    int data ;
    Node1 next ;

    public Node1(int data){
        this.prev = null ;
        this.data = data ;
        this.next = null ;
    }
}


public class _1_Implementation_Of_Doubly_Linked_List {

    Node1 head ;

    public void insert_Node(int data){
        Node1 newNode = new Node1(data) ;

        if(head==null){
            head = newNode ;
            return ;
        }

        Node1 temp = head ;

        while(temp.next !=null){
            temp = temp.next ;
        }
        temp.next = newNode ;
        newNode.prev = temp ;

    }

    public void display_Node(){

        if(head==null){
            System.out.println("Double Linked List be empty.") ;
            return ;
        }

        Node1 temp = head ;

        while(temp !=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;

        }
        System.out.println("null") ;
    }
    public static void main(String [] args){
        System.out.println("Double Linked List Implementation") ;

        _1_Implementation_Of_Doubly_Linked_List list = new _1_Implementation_Of_Doubly_Linked_List() ;


        list.insert_Node(1) ;
        list.insert_Node(2) ;
        list.insert_Node(3) ;
        list.insert_Node(4) ;
        list.insert_Node(5) ;

        System.out.println("Doubly Linked List be: ") ;
        list.display_Node() ;


    }
    
}