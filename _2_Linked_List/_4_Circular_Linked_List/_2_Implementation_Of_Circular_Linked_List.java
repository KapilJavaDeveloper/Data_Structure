
class Node2{
    
    int data ;
    Node2 next ;

    public Node2(int data){
        this.data = data ;
        this.next = null ;
    }
}


public class _2_Implementation_Of_Circular_Linked_List {

    Node2 head ;

    public void insert_Node(int data){
        Node2 newNode = new Node2(data) ;

        if(head==null){
            head = newNode ;
            newNode.next = head ;
            return ;
        }

        Node2 temp = head ;

        while(temp.next!=head){
            temp = temp.next ;
        }
        temp.next = newNode ;
        newNode.next = head ;
    }

    public void display_Circular_Linked_List(){
        if(head==null){
            System.out.println("Circular Linked List be empty") ;
            return ;

        }

        Node2 temp = head ;
        
        while(temp.next != head){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.print(temp.data) ;
        

    }

    public static void main(String [] args){
        System.out.println("Implementation Of Circular Linked List") ;

        _2_Implementation_Of_Circular_Linked_List list = new _2_Implementation_Of_Circular_Linked_List() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);

        System.out.println("Circular Linekd List be:  ") ;
        list.display_Circular_Linked_List();


    }
    
}
