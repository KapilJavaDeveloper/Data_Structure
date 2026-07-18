class Node2{
    int data ;
    Node2 prev ;
    Node2 next ;

    public Node2(int data){
        this.data = data ;
        prev = null ;
        next = null ;
    }

}
public class _2_Doubly_Circular_Linked_List {

    Node2 head ;
    Node2 tail ;
 
    public void insert_Node(int data){

        Node2 newNode = new Node2(data)  ;   
        if(head==null){
            head = newNode ;
            tail = newNode ;
            newNode.prev = tail ;
            newNode.next = head ;
            return ;
        }

        tail.next = newNode ;
        newNode.prev = tail ;
        tail = newNode ;
        tail.next = head ;
        head.prev = tail ;
    }

    public void display_Node(){
        if(head == null){
            System.out.println("Double Circular Linked List be empty.") ;
            return ;
        }

        Node2 temp = head ;

        do{
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }while(temp!=head) ;
        System.out.println() ;
    }
    public static void main(String [] args){
        System.out.println("Implementation of Doubly Circular Linked List.") ;

        _2_Doubly_Circular_Linked_List list = new _2_Doubly_Circular_Linked_List()  ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);

        System.out.println("Doubly Circular Linked List be: ") ;
        list.display_Node();

        System.out.println(list.tail.next.data) ;
    }
    
}