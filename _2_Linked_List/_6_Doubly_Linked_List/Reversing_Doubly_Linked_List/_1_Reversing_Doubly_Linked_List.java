// package _2_Linked_List._6_Doubly_Linked_List.Reversing_Doubly_Linked_List;

class Node1{
    Node1 prev ;
    int data ;
    Node1 next ;

    public Node1(int data){
        this.next = null ;
        this.data = data ;
        this.next = null ;
    }
}
public class _1_Reversing_Doubly_Linked_List {

    Node1 head ;

    public void insert_Node(int data){
        Node1 newNode = new Node1(data) ;

        if(head==null){
            head = newNode ;
            return ;
        }
        Node1 temp = head ;

        while(temp.next != null){
            temp = temp.next ;
        }
        temp.next = newNode ;
        newNode.prev = temp ;
    }

    public void display(){
        if(head==null){
            System.out.println("Doubly Linked List be empty.") ;
            return ;
        }

        Node1 temp = head ;

        while(temp != null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;
        
    }

    public void reversing_Doubly_Linked_List(){
        if(head==null){
            System.out.println("Doubly Linekd List be empty.") ;
            return ;
        }

        Node1 currentNode = head ;
        

        while(currentNode!=null){
            head = currentNode ; 
            Node1 temp = currentNode.prev ;
            currentNode.prev = currentNode.next ;

            currentNode.next = temp ;
            
            currentNode = currentNode.prev ; 
        }
        


    }

    public static void main(String [] args){
        System.out.println("Reversing a Doubly Linked List") ;
        _1_Reversing_Doubly_Linked_List list = new _1_Reversing_Doubly_Linked_List() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);
        list.insert_Node(5);
        list.insert_Node(6);
        list.insert_Node(7);
        list.insert_Node(8);
        list.insert_Node(9);
        list.insert_Node(90);
        
        System.out.println("Doubly Linked List be: ") ;
        list.display() ;
        
        System.out.println("Reverse of Doubly Linked List: " ) ;
        list.reversing_Doubly_Linked_List();
        list.display() ;

    }
    
    
}
