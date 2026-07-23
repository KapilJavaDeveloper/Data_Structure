// package _3_Stack;
class Node2{
    int data ;
    Node2 next ;

    public Node2(int data){
        this.data = data ;
        this.next = null ;
    }
}

public class _2_Implementing_Stack_Using_Linked_List {
    
    static Node2 head = null ;
   


    public static void push(int data){

        Node2 newNode = new Node2(data) ;

        if(head==null){

            head = newNode ;
            return ;
        }
        newNode.next = head ;
        head = newNode ;

       
        
  
    }

    public static void display_Stack(){
        if(head==null){
            System.out.println("Stack is Empty. UnderFlow Condition.") ;
            return ;
        }
        Node2 temp = head ;
       

        while(temp!=null){
            System.out.print(temp.data + " ") ;
            temp = temp.next ;
        } 
        System.out.println() ;

       
    }

    public static void pop(){
        if(head==null){
            System.out.println("Empty Stack , UnderFlow Condition") ;
            return ;
        }

        
        System.out.println("Removed "+head.data + " from Stack") ;
        Node2 temp = head.next ;
        head = null ;
        head = temp ;
        display_Stack();
    }

    public static void peek(){
        if(head==null){
            System.out.println("Stack is Empty.") ;
            return ;
        }
        System.out.println("Peek Element in Stack be: " + head.data) ;

    }


  
  

    public static void main(String [] args){
        System.out.println("2 Program Implementing Stack Using Linked List") ;

        push(1) ;
        push(2) ;
        push(3) ;

        display_Stack();
        pop() ;

        peek();


      


        
    }
    
}
