class Node4{
    int data ;
    Node4 prev ;
    Node4 next ;

    public Node4(int data){
        this.data = data ;
        this.prev = null ;
        this.next = null ;
    } 
}
public class _4_Insertion_At_The_End {
    Node4 head ;
    Node4 tail ;

    public void insert_Node(int data){
        Node4 newNode = new Node4(data) ;

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

        Node4 temp = head ;
        

        do{
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }while(temp!=head)  ;
        
        System.out.println()  ;

    }

    public  void insert_Node_At_End(int data){
        Node4 newNode = new Node4(data)  ;
        if(head==null){
            head = newNode ;
            tail = newNode ;
            head.prev = tail ;
            tail.next = head ;
            return ;

        }

        tail.next = newNode ;
        newNode.prev = tail ;
        newNode.next = head ;
        head.prev = newNode ;
        tail = newNode ;
    }

    public static void main(String [] args){
        System.out.println("4. Insertion At The End of the Doubly Circular Linked List") ;

        _4_Insertion_At_The_End list = new _4_Insertion_At_The_End() ;


        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);  

        System.out.println("Double Circular Linked List be: ") ;
        list.display_Node();

        System.out.println("Inserting Node " + 8 + " at the end of Linked List " ) ;
        list.insert_Node_At_End(8);
        list.display_Node();

    }
    
}
