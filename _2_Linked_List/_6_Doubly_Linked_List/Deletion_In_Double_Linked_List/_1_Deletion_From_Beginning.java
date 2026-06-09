// package _2_Linked_List._6_Doubly_Linked_List.Deletion_In_Double_Linked_List;

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
public class _1_Deletion_From_Beginning {

    Node1 head ;

    public void insert_Node(int data){

        Node1 newNode = new Node1(data) ;

        if(head==null){
            head = newNode ;
            return ;
        }

        Node1 temp = head ;

        while(temp.next!=null){
            temp = temp.next ;
        }
        temp.next = newNode ;
    }

    public void display_Node(){
        if(head==null){
            System.out.println("Double Linked List be empty.") ;
            return ;
        }

        Node1 temp = head ;

        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;
    }

    public void delete_From_Beginning(){
        if(head==null){
            System.out.println("Double Linked List be empty.") ;
            return ;
        }
        head = head.next ;
        head.prev = null ;
    }
    public static void main(String [] args){

        System.out.println("Deletion a double linked list element from beginning.") ;
        _1_Deletion_From_Beginning list = new _1_Deletion_From_Beginning() ;

        list.insert_Node(1) ;
        list.insert_Node(2) ;
        list.insert_Node(3) ;
        list.insert_Node(4) ;

        System.out.println("Double Linekd List be: ") ;
        list.display_Node() ;

        System.out.println("Double Linked List after deleting element from beginning be: ") ;
        list.delete_From_Beginning() ;
        list.display_Node() ;

        
    }
    
}
