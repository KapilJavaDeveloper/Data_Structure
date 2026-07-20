// package Deletion_In_Circular_Linked_List;

class Node1{
    int data  ;
    Node1 prev ;
    Node1 next ;

    public Node1(int data){
        this.data = data ;
        prev = null ;
        next = null ;
    }


}

public class _1_Deletion_From_Beginning {

    Node1 head ;
    Node1 tail ;

    public void insert_Node(int data){
        Node1 newNode = new Node1(data)  ;

        if(head == null){
            head = newNode ;
            tail = newNode ;
            head.prev = tail ;
            tail.next = head ;
            return ;
        }

        tail.next = newNode ;
        newNode.prev = tail ;
        newNode.next = head ;
        tail = newNode ;
        head.prev = tail ;

    } 

    public void display_Linked_List(){
        if(head == null){
            System.out.println("Doubly Circular Linked List be empty") ;
            return ;
        }

        Node1 temp = head ;
        System.out.println("Doubly Circular Linked List be: ") ;

        do{
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }while(temp!=head)  ;
    }

    public void deletion_From_Begining( _1_Deletion_From_Beginning list){
        if(head==null){
            System.out.println("Doubly Circular Linked List be empty.") ;
            return ;
        }
        else if(head == tail){
            System.out.println();
            System.out.println("Begining Deletion From Doubly Circular Linked List.");
            head = null ;
            tail = null ;
            head.prev = null ;
            tail.next = null ;
            return ;
        }
        System.out.println();
        System.out.println("Begining Deletion From Doubly Circular Linked List.") ;
        Node1 temp = head.next ;
        head = null ;
        head = temp ;
        head.prev = tail ;
        tail.next = head ;


        list.display_Linked_List();



    }
    public static void main(String [] args){
        System.out.println("Begining Deletion From Double Circular Linked List") ;

        _1_Deletion_From_Beginning list = new _1_Deletion_From_Beginning() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);
        list.insert_Node(5);

        list.display_Linked_List();

        list.deletion_From_Begining(list);
        list.deletion_From_Begining(list);



        
    }

    
}
