// package _2_Linked_List.Single_Linked_List.Deletion_In_Single_Linked_List;

class Node3{
    int data ;
    Node3 next ;

    public Node3(int data){
        this.data = data ;
        this.next = null ;
    }

}
public class _3_Deletion_From_Specific_Position {

    Node3 head ;


        void insert_Elements(int data){

        Node3 newNode = new Node3(data) ;

        
        if(head==null){
            head = newNode ;
            return ;
        }

        Node3 temp = head  ;

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

    void deletion_At_Specific_Position(int pos){

        if(head==null){
            System.out.println("Linked List be empty: ") ;
            return ;
        }
        else if(pos<=0){
            System.out.println("Invalid position(less than or equal to 0)") ;
            return ;

        }

        else if(pos==1){
            head = head.next ;
            return ;
        }

       
        Node3 temp = head ;
        Node3 prev = null  ;

        for(int i=1 ; i<pos && temp!=null ; i++){
            prev = temp ;
            temp = temp.next ;

        }
        if(temp!=null){
            
            prev.next = temp.next ;
            temp = null ;
            
        }
        else{
            System.out.println("Invalid Position") ;
        }
    }

    public static void main(String [] args){
        _3_Deletion_From_Specific_Position list = new _3_Deletion_From_Specific_Position() ;

        list.insert_Elements(1) ;
        list.insert_Elements(2) ;
        list.insert_Elements(3) ;
        list.insert_Elements(4) ;
        list.insert_Elements(5) ;

        System.out.println("Original Linked List be: ") ;
        list.display() ;

        int pos = 6 ;
        
        System.out.println("Linked List after deleting element from position "+ pos + " be: ") ;
        list.deletion_At_Specific_Position(pos) ;
        list.display() ;

 
    }
    
}
