// package _2_Linked_List._6_Doubly_Linked_List.Insertion_In_Double_Linked_List;

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
public class _1_Insertion_At_Beginning {

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

    public void insertion_At_Beginning(int data){
        Node1 newNode = new Node1(data) ;

        if(head==null){
            head = newNode ;
            return ;
        }

        head.prev = newNode ;
        newNode.next = head ;
        head = newNode ;
    }



    public static void main(String [] args){

        _1_Insertion_At_Beginning list = new _1_Insertion_At_Beginning() ;

        list.insert_Node(10) ;
        list.insert_Node(20) ;
        list.insert_Node(30) ;
        list.insert_Node(40) ;
        list.insert_Node(50) ; 

        System.out.println("Doubly Linked List be: ") ;
        list.display_Node() ;


        list.insertion_At_Beginning(5) ;
        System.out.println("Insertion At Beginning of Linked List be: ") ;
        list.display_Node() ;


    }
    
}