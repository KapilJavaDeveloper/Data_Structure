class Node4{

    int data ;
    Node4 next ;

    public Node4(int data){
        this.data = data ;
        this.next = null ;
    }

}
public class _4_Insertion_At_Beginning_of_Circular_Linked_List {

    Node4 head ;

    public void insert_Node_At_End(int data){
        Node4 newNode = new Node4(data) ;

        if(head==null){
            head= newNode ;
            head.next = head ;
            return ;
        }

        Node4 temp = head ;

        while(temp.next != head){
            temp = temp.next ;
        }
        temp.next = newNode ;
        newNode.next = head ;
    }

    public void display(){

        if(head==null){
            System.out.println("Circular linked List be empty.") ;
            return ;
        }

        Node4 temp = head ;

        while(temp.next !=head){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.print(temp.data) ;

    }

    public void insert_At_The_Begining(int data){
        Node4 newNode = new Node4(data) ;

        if(head==null){
            head = newNode ;
            head.next = head ;
            return ;
        }

        Node4 temp = head ;

        while(temp.next !=head){
            temp = temp.next ;
        }
        temp.next = newNode ;
        newNode.next = head ;
        head = newNode ;

    }

    public static void main(String [] args){

        System.out.println("Insertion at the Beginning of Circular Linekd List Program") ;

        _4_Insertion_At_Beginning_of_Circular_Linked_List list = new _4_Insertion_At_Beginning_of_Circular_Linked_List() ; 

        list.insert_Node_At_End(1); 
        list.insert_Node_At_End(2); 
        list.insert_Node_At_End(3); 
        list.insert_Node_At_End(4); 


        System.out.println("Circular Linked List be: ") ;
        list.display();

        System.out.println("Circlular Linked List after inserting data at the beginning: ") ;
        list.insert_At_The_Begining(6);
        list.display() ;

    }
    
}
