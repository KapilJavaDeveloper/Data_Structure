// package _3_Stack;


public class _1_Implementing_Stack_Using_Arrays {
    static int size = 8 ;
    static int[] stack = new int[size]  ;
    static int top = -1; 

    public static void push(int data){
        if(top>=size){
            System.out.println("Overflow Condition") ;
            return ;
        }
        top++ ;
        stack[top] = data ;
    }
    public static void pop(){
        if(top<0){
            System.out.println("Stack Underflow Condition.") ;
            return ;
        }

        System.out.println("Element "+ stack[top] + " removed from stack ") ;
        top-- ;
    }

    public static void peek(){
        if(top<0){
            System.out.println("Stack is Empty") ;
            return ;
        }

        System.out.println("Peek Element of an Array be: " + stack[top]) ;
    }

    public static void display_Stack(){
        if(top<0){
            System.out.println("Stack is Empty.") ;
            return ;
        }

        System.out.println("Stack be: ") ;
        for(int i=top ; i>=0 ; i--){
            System.out.println(stack[i]) ;
        }
    }
    public static void main(String [] args){

        System.out.println("1 Program to Implement Stack Arrays.") ;
        
        push(1) ;
        push(2) ;
        push(3) ;
        push(4) ;

        display_Stack();

        peek() ;
        
        pop() ;
        display_Stack();

        pop() ;
        display_Stack();


        pop() ;
        display_Stack();




    }
    
}
