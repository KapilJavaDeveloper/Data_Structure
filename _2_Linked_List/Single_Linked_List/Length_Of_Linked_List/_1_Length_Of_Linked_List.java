package _2_Linked_List.Single_Linked_List.Length_Of_Linked_List;
class Node1{
    int data ;
    Node1 next ;

    public Node1(int data){
        this.data = data ;
        this.next = null ;
    }
}


public class _1_Length_Of_Linked_List {

    Node1 head ;

    public void insertNode(int data){

        Node1 newNode = new Node1(data) ;

        if(head ==null){
            head = newNode ;
            return ;
        }

        Node1 temp = head ;

        while(temp.next!=null){
            temp = temp.next ;
        }
        temp.next = newNode ;

    }

    public void displayNode(){

        if(head ==null){
            System.out.println("Linked List be empty") ;
            return ;
        }

        Node1 temp = head ;

        while(temp!=null){
            System.out.print(temp.data + " -> ") ;
            temp = temp.next ;
        }
        System.out.println(" null ") ;

    }

    public int length(){

        if(head==null){
            return 0 ;
        }

        Node1 temp = head ;

        int count =0 ;

        while(temp!=null){
            count++ ;
            temp = temp.next ;
        }

        return count;


    }
    public static void main(String [] args){
        System.out.println("Length of Linked List") ;

        _1_Length_Of_Linked_List list = new _1_Length_Of_Linked_List() ;

        list.insertNode(1) ;
        list.insertNode(2) ;
        list.insertNode(3) ;
        list.insertNode(4) ;

        System.out.println("Linked List be: ") ;
        list.displayNode() ;

        System.out.print("Length of Linekd List be: ") ;
        System.out.println(list.length() ) ;



    }
    
}
