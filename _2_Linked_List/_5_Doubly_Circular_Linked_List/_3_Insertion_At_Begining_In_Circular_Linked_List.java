class Node3{
    int data ;
    Node3 prev ;
    Node3 next ;

    public Node3(int data){
        this.data = data ;
        this.prev = null ;
        this.next = null ;
    }
}
public class _3_Insertion_At_Begining_In_Circular_Linked_List{

    Node3 head ;
    Node3 tail ;

    public void insert_Node(int data){
        Node3 newNode = new Node3(data) ;

        if(head==null){
            head = newNode ;
            tail = newNode ;
            head.prev = tail ;
            tail.next = head ;
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
            System.out.println("Double Circular linked List be empty.") ;
            return ;
        }

        Node3 temp = head ;

        do{
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }while(temp!=head)  ;

    }

    public void insert_Node_At_Start(int data){
        Node3 newNode = new Node3(data)  ;

        if(head==null){
            head = newNode ;
            tail = newNode ;
            head.prev =tail ;
            tail.next = head ;
            return ;
        }

        head.prev = newNode ;
        newNode.next = head ;
        newNode.prev = tail ;
        tail.next = newNode ;
        head = newNode ;

    }
    public static void main(String [] args){
        System.out.println("3. Program Inserting a Node At The Beginning of Double Circular Linked List.");

        _3_Insertion_At_Begining_In_Circular_Linked_List list = new _3_Insertion_At_Begining_In_Circular_Linked_List()  ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);  

        System.out.println("Double Circular Linked List be: ") ;
        list.display_Node();

        int start = 5 ;

        System.out.println() ;
        System.out.println("Inserting "+ start +  " at the Begining of the Double Circular Linked List- ") ;
        list.insert_Node_At_Start(start);
        list.display_Node();


    }
}