class Node1{
    int data ;
    Node1 next ;

    public Node1(int data){
        this.data = data ;
        this.next =null ;
    }
}

public class _1_Reversing_Linked_List{

    Node1 head ;

    public void insert_Node(int data){
    Node1 newNode = new Node1(data) ;

    if(head==null){
        head = newNode ;
        return ;
    }

    Node1 temp = head ;

    while(temp.next !=null){
        temp = temp.next ;
    }
    temp.next = newNode ;


}

public void display_Node(){
    if(head==null){
        System.out.println("Linekd List be empty") ;
        return ;
    }

    Node1 temp = head ;

    while(temp!=null){
        System.out.print(temp.data + " -> ") ;
        temp = temp.next ;
    }
    System.out.println("null") ;
}

public void reverse_List(){
    if(head==null){
        System.out.println("Linked List be empty.") ;
        return ;
    }

    Node1 prevNode = null ;

    Node1 currentNode = head ;

    Node1 nextNode = head ;

    while(currentNode !=null){

        nextNode = nextNode.next ;
        currentNode.next = prevNode ;
        prevNode = currentNode ;
        currentNode = nextNode ;

    }
    head = prevNode ;



}
    public static void main(String [] args){
        System.out.println("Reverse of Single Linekd List Program -> ") ;

        _1_Reversing_Linked_List list = new _1_Reversing_Linked_List() ;

        list.insert_Node(1) ;
        list.insert_Node(2) ;
        list.insert_Node(3) ;
        list.insert_Node(4) ;

        System.out.println("Linked List be:") ;
        list.display_Node() ;

        System.out.println("Reverse of Linked List be: ") ;
        list.reverse_List() ;
        list.display_Node() ;

    }
}