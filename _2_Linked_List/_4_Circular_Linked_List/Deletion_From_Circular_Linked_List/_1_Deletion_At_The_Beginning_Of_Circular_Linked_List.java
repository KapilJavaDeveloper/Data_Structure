// package Deletion_From_Circular_Linked_List;

class Node1{
    int data ;
    Node1 next ;

    public Node1(int data){
        this.data = data ;
        this.next = null ;
    }
}
public class _1_Deletion_At_The_Beginning_Of_Circular_Linked_List {
    Node1 head ;
    Node1 tail ;

    public void insert_Node(int data){
        Node1 newNode = new Node1(data) ;

        if(head==null){
            head = newNode ;
            tail = newNode ;
            return ;
        }

        tail.next = newNode ;
        tail = newNode ;

    }

    public void display_Node(){
        if(head==null){
            System.out.print("Circular Linked List be empty.") ;
            return ;
        }

        Node1 temp = head ;

        while(temp!=tail){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.print(temp.data + " -> " + "null") ;
    }

    public void deletion_From_Beginning(_1_Deletion_At_The_Beginning_Of_Circular_Linked_List list){
        if(head == null){
            System.out.println("Circular Linekd List be empty.") ;
            return ;
        }

        while(head!=null){
            head = head.next ;
            System.out.println() ;
            list.display_Node() ;
        }

    }
    public static void main(String [] args){
        

        System.out.println("Deletion a Node From Circular Linked List.") ;

        _1_Deletion_At_The_Beginning_Of_Circular_Linked_List list = new _1_Deletion_At_The_Beginning_Of_Circular_Linked_List() ;
        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);

        System.out.println("Circular Linked List be: ") ;
        list.display_Node();

        System.out.println() ;
        System.out.println("Deleting Node From of Circular Linked List: ") ;
        list.deletion_From_Beginning(list);
       


    }
    
}
