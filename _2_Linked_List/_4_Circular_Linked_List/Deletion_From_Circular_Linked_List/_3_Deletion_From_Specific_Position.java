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
    Node3 tail ;

    public void insertNode(int data){

        Node3 newNode = new Node3(data) ;

        if(head==null){
            head = newNode ;
            tail = newNode ;
            tail.next = head ;
            return ;
        }

        tail.next = newNode ;
        tail = newNode ;
        tail.next = head ;
    }

    public void display_Node(){
        if(head==null){
            System.out.println("Circular Linked List be empty.") ;
            return ;
        }

        Node3 temp = head ;


        do{
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }while(temp!=head) ;
    
    }

    public void delete_Node_At_Specific_Position(int position){

        if(head==null){
            System.out.println("Can't delete , Circular Linked List be empty") ;
            return ;
        }
        else if(position<1){
            System.out.println("1 Invalid Position") ;

        }
        else if(head.next==null && position==1){
            head = null ;
            tail = null ;
            return ;
        }
        else if(head.next==null && position!=1){
            System.out.println("2 Invalid Position ") ;
            return;
        }
        else if(position==1){
            head = head.next ;
            tail.next = head ;
            return ;
        }

        Node3 prevNode = null ;
        Node3 currentNode = head ;
        int start = 0 ; 

        for(start=1 ; start<position && currentNode.next!=head ; start++){
            prevNode = currentNode ;
            currentNode = currentNode.next ;
        }

        if(start!=position && currentNode.next==head){
            System.out.println("Invalid Position") ;
        }
        else if(start==position && currentNode.next!=head){
            prevNode.next = currentNode.next ;
            currentNode = null ;

        }
        else if(start==position && currentNode.next==head){
            prevNode.next = currentNode.next ;
            tail = prevNode ;
            currentNode = null ;
        }

    }
    public static void main(String[] Isskander){

        System.out.println("Program to delete a Node from Specific Position.") ;

         _3_Deletion_From_Specific_Position list = new  _3_Deletion_From_Specific_Position() ;

         list.insertNode(10);
         list.insertNode(20);
         list.insertNode(30);
         list.insertNode(40);

         
        
         System.out.println("Circular Linked List be : ") ;
         list.display_Node();

         int position  = 5;


         System.out.println() ;

         System.out.println("Circular Linked List after deleting a Node at position " + position ) ;
         list.delete_Node_At_Specific_Position(position);
         list.display_Node();


    }

    
}
