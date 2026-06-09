// package _2_Linked_List._6_Doubly_Linked_List.Deletion_In_Double_Linked_List;

class Node3{
    Node3 prev ;
    int data ;
    Node3 next ;

    public Node3(int data){
        this.prev = null ;
        this.data = data ;
        this.next = null ;
    }
}

public class _3_Deletion_At_Specific_Position {
    Node3 head ;
    public void insert_Node(int data){
        Node3 newNode = new Node3(data) ;

        if(head==null){
            head = newNode ;
            return ;
        }

        Node3 temp = head ;

        while(temp.next != null){
            temp = temp.next ;
        }
        temp.next = newNode ;

}

public void display_Node(){
    if(head==null){
        System.out.println("Double Linked List is empty") ;
        return ;
    }

    Node3 temp = head ;
    while(temp!=null){
        System.out.print(temp.data + " -> ") ;
        temp = temp.next ;
    }
    System.out.println("null") ;

}

public void delete_At_Specific_Position(int position){
    if(head==null){
        System.out.println("Double Linked List be empty.") ;
        return ;
    }
    else if(head.next==null && position==1){
        head=null ;
        return ;
    }
    else if((head.next==null && position>1) || position <1){
        System.out.println("Invalid Position") ;
        return ;
    }
    else if(position==1 && head!=null){
        head = head.next ;
        return ;

    }
    

    Node3 prevNode = null ;
    Node3 currentNode = head ;

    int start ;

    for(start =1 ; start<position && currentNode!=null ; start++){
        prevNode = currentNode ;
        currentNode = currentNode.next ;
    }



     if(currentNode==null && start < position){
        System.out.println("Invalid Position") ;
    }
    else if(currentNode.next==null && start == position){
        prevNode.next = null ;
        currentNode.prev = null ;
    }
    
    else{
        prevNode.next = currentNode.next ;
        currentNode.next.prev = prevNode ;
        currentNode.next = null ;
        currentNode.prev = null ;

    }

 
    


}
    public static void main(String [] args){

        _3_Deletion_At_Specific_Position list = new _3_Deletion_At_Specific_Position() ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);
        list.insert_Node(5);

        System.out.println("Doubled Linked List be: ") ;
        list.display_Node();

        int position = 5;

        list.delete_At_Specific_Position(position);
        System.out.println("Doubled Linked List after deleting element At "+ position) ;
        list.display_Node();


    }
    
}
