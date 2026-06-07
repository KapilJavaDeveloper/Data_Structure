class Node2{
    Node2 prev ;
    int data ;
    Node2 next ;

    public Node2(int data){
        this.prev = null ;
        this.data = data ;
        this.next = null ;

    }
}
public class _2_Insertion_At_The_End {

    Node2 head ;

    public void insert_Node(int data){

        Node2 newNode = new Node2(data) ;

        if(head == null){
            head = newNode ;
            return ;
        }

        Node2 temp = head ;

        while(temp.next != null){
            temp = temp.next ;
        }
        temp.next = newNode ;
        newNode.prev = temp ;


    }

    public void display(){
        if(head == null){
            System.out.println("Double Linked List be empty.") ;
            return ;
        }

        Node2 temp = head;

        while(temp !=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;

    }

    public void insert_At_End(int data){
        Node2 newNode = new Node2(data) ;

        if(head==null){
            head = newNode ;
            return ;
        }

        Node2 temp = head ;

        while(temp.next !=null){
            temp = temp.next ;
        }

        temp.next = newNode ;
        newNode.prev = temp ;

    }
    public static void main(String [] args){
        System.out.println("Insertion At The End of Double Linked List") ;

        _2_Insertion_At_The_End list = new _2_Insertion_At_The_End() ;

        list.insert_Node(1) ;
        list.insert_Node(2) ;
        list.insert_Node(3) ;
        list.insert_Node(4) ; 

        System.out.println("Double Linked List be: ") ;
        list.display() ;

        System.out.println("Inserting Node at the end: ") ;
        list.insert_At_End(5) ;
        list.display() ;

    }
    
}
