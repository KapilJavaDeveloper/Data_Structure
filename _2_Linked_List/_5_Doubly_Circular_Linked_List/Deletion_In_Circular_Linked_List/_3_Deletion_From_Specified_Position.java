class Node3{
    int data ;
    Node3 prev ;
    Node3 next ;

    public Node3(int data){
        this.data = data ;
        this.prev = null ;
        this.next = null ;
    }
}
public class _3_Deletion_From_Specified_Position {

    Node3 head ;
    Node3 tail ;

    public void insert_Node(int data){
        Node3 newNode = new Node3(data)  ;

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
        tail = newNode ;
        head.prev = tail ;


    }

    public void display_Node(){
        if(head==null){
            System.out.println("Doubly Linked List be empty.") ;
            return ;
        }
        System.out.println() ;
        System.out.println("Doubly Linked List be: ") ;
        Node3 temp = head ;

        do{
            System.out.print(temp.data + " -> " ) ;
            temp = temp.next ;
        }while(temp!=head) ;


    }

    public void delete_From_Specific_Position(int position, _3_Deletion_From_Specified_Position list){
        if(head==null){
            System.out.println("Doubly Linked List be empty.") ;
            return ;
        }
        else if(head==tail && position==1){
            head = null ;
            tail = null ;
            head.prev = null ;
            tail.next = null ;
            list.display_Node();
            return ;
        }
        else if(head==tail && position>1){
            System.out.println("Invalid Position") ;
            return ;
        }
        else if(position==1){
            Node3 temp = head.next ;
            head = null ;
            head = temp ;
            head.prev = tail ;
            tail.next = head ;
            list.display_Node();

            return ;
        }

        Node3 prevNode = null ;
        Node3 currentNode = head ;
        int index = 0 ;

        for(index=1 ; index<position && currentNode.next!=head ; index++){
            prevNode = currentNode ;
            currentNode = currentNode.next ;

        }

        if(currentNode == tail && index == position){
            Node3 temp = tail.prev ;
            tail = null ;
            tail = temp ;
            tail.next = head ;
            head.prev = tail ;
        }
        else if(index<position ){
            System.out.println("Invalid Index") ;
            return ;

        }
        else if(index==position && currentNode != head){
            Node3 temp1 = currentNode ;
            Node3 temp2 = currentNode.next ;

            currentNode = null ;
            prevNode.next = temp1.next ;
            prevNode.next.prev = prevNode ;

       }


       System.out.println() ;
       System.out.println("After deletion Doubly Linked List be: ") ;
       list.display_Node();
    }
    public static void main(String [] args){
        System.out.println("Program to Delete a Node at Specific Position.")  ;

        _3_Deletion_From_Specified_Position list = new _3_Deletion_From_Specified_Position()  ;

        list.insert_Node(1);
        list.insert_Node(2);
        list.insert_Node(3);
        list.insert_Node(4);
        list.insert_Node(5);

        list.display_Node();

        int position = 5 ;

        list.delete_From_Specific_Position(position, list);
     



    }
    
}
