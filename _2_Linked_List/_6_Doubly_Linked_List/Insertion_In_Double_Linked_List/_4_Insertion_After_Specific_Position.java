class Node4{
    Node4 prev ;
    int data ;
    Node4 next ;

    public Node4(int data){
        this.prev = null ;
        this.data = data ;
        this.next = null ;

    }
}


public class _4_Insertion_After_Specific_Position {

    Node4 head ;

    public void insertNode(int data){

        Node4 newNode = new Node4(data) ;

        if(head==null){
            head = newNode ;
            return ;
        }

        Node4 temp = head ;

        while(temp.next !=null){
            temp = temp.next ;
        }
        temp.next = newNode ;
        newNode.prev = temp ;
        newNode.next = null ;


    }

    public void displayNode(){
        if(head ==null){
            System.out.println("Double Linked List be empty.") ;
            return ;
        }

        Node4 temp = head ;

            while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println("null") ;

    }

    public void insertion_At_Specific_Position(int data, int position){
        Node4 newNode = new Node4(data) ;

        if(head==null && position ==1){
            System.out.println("Invalid Position") ;
            return ;
        }
        else if(position<1){
            System.out.println("Invalid position") ;
            return ;
        }
        else if(head == null && position>1){
            System.out.println("Invalid Position") ;
            return ;
        }
        else if(position==1){
            Node4 temp = head.next ;
            head.next = newNode ;
            newNode.prev = head ;
            newNode.next = temp ;
            return ;

        }

        
        Node4 currentNode = head ;
        Node4 nextNode = null ;
        int i=1 ;

        for(i=1 ; i<=position && currentNode.next!=null ; i++){
            currentNode= currentNode.next ;
            nextNode = currentNode.next ;

        }

        if(currentNode.next==null &&  position == i){
            currentNode.next = newNode ;
            newNode.prev = currentNode ;

        }
        else if(currentNode.next==null){
            System.out.println("Invalid Position") ;
            return ;
        }
        else{
            currentNode.next = newNode ;
            newNode.prev = currentNode ;
            newNode.next = nextNode ;
        }





    }
    public static void main(String [] args){
        System.out.println("Insertion After Specific Position") ;

        _4_Insertion_After_Specific_Position list = new _4_Insertion_After_Specific_Position() ;

        list.insertNode(1) ;
        list.insertNode(2) ;
        list.insertNode(3) ;
        list.insertNode(4) ;

        System.out.println("Double Linekd List be: ") ;
        list.displayNode() ;

        int position =1 ;

        System.out.println("Inserting Node after position "+ position) ;
        list.insertion_At_Specific_Position(12 , position) ;
        list.displayNode() ;



    }
    
}
