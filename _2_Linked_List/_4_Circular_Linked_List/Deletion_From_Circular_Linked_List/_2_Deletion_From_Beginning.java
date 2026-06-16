class Node2{
    int data ;
    Node2 next ;

    public Node2(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _2_Deletion_From_Beginning{

    Node2 head ;
    Node2 tail ;


    public void insert_Node(int data){
        Node2 newNode = new Node2(data) ;

        if(head==null){
            head=newNode ;
            tail=newNode ;
            tail.next = head ;
            return ;
        }

        tail.next = newNode ;
        tail = newNode ;
        tail.next = head ;
    }

    public void display_Node(){
        if(head==null){
            System.out.println("Circular Linked List be empty.....") ;
            return ;
        }

        Node2 temp = head ;

        do{
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }while(temp!=head) ;


    }
    public void deletion_From_End(_2_Deletion_From_Beginning list){
        if(head==null){
            System.out.println("Circular Linked List be empty") ;
            return ;
        }
        else if(head.next==head){
            head = null ;
            tail = null ;
            return ;
        }

        Node2 currentNode = head ;
        Node2 prevNode = null ;

        while(currentNode.next !=head){
            prevNode = currentNode ;
            currentNode = currentNode.next ;

        }
        prevNode.next = currentNode.next;
        currentNode = null ;
        tail = prevNode ;

        System.out.println() ;
        System.out.println("Circular Linked List after deleting element from end -- ") ;
        list.display_Node() ;

        
    }
    public static void main(String [] args){
        System.out.println("Deletion From End in Circular Linked List Program.") ;

        _2_Deletion_From_Beginning list = new _2_Deletion_From_Beginning() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);
        list.insert_Node(5);

        System.out.println("Circular Linked List be: ") ;
        list.display_Node() ;

        while(list.head!=null){
            list.deletion_From_End( list ) ;
        }

    
    }
}