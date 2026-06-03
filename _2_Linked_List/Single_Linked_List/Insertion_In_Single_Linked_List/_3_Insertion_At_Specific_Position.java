import java.util.Scanner ;
class Node3{
    int data ;
    Node3 next ;

    public Node3(int data){
        this.data = data ;
        this.next = null ;
    }

}
public class _3_Insertion_At_Specific_Position {

    Node3 head ;

    void insert_Node(int data){
        Node3 newNode = new Node3(data) ;

        if(head==null){
            head = newNode ;
            return ;
        }

        Node3 temp = head ;
        
        while(temp.next!=null){
            temp = temp.next ;
        }
        temp.next = newNode ;
    }

    void display(){
        
        if(head==null){
            System.out.println("Linked List be empty") ;
            return ;
        }

        Node3 temp = head ;

        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;
    }

    void insert_At_Specific_Position(int num , int pos){

        Node3 temp = head ;
        Node3 newNode = new Node3(num) ;
        if(pos ==1){
            head = newNode ;
            head.next = temp ;
            return ;
        }

        for(int i=1 ; i<pos-1 && temp!=null ; i++){
            temp = temp.next ;

        }

        if(temp==null){
            System.out.println("Invalid position") ;
            return ;
        }

        newNode.next = temp.next ;
        temp.next = newNode ;

    }

    
    public static void main(String [] args){
        System.out.println("Insertion at the Specific Position") ;

        _3_Insertion_At_Specific_Position list = new _3_Insertion_At_Specific_Position() ;

        list.insert_Node(10) ;
        list.insert_Node(20) ;
        list.insert_Node(30) ;
        list.insert_Node(40) ;

        System.out.println("Original Linked List be: ") ;
        list.display()  ;

        

        list.insert_At_Specific_Position(2,10) ;
        System.out.println("Linked List after insertion") ;
        list.display() ;

    }
    
}