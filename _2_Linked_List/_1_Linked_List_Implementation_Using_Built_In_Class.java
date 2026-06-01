// package _2_Linked_List;

import java.util.LinkedList ;
public class _1_Linked_List_Implementation_Using_Built_In_Class {
    public static void main(String [] args){

        System.out.println("Linked List Implementation By Built In Class") ;

        LinkedList<String> str = new LinkedList<>() ;

        str.add("Isskander") ;
        str.add("Isskander 2") ;
        str.add("issaknder 3") ;

                System.out.println("Element at index 0 be: " + str.get(0)) ;
        System.out.println("Element at index 1 be: " + str.get(1)) ;

        System.out.println("Linked List be: " + str) ;



        str.remove(0) ;
        System.out.println("Linked List after removing element at index 0 be: ") ;
        System.out.println(str) ;

        str.remove(1) ;
        System.out.println("Linked List after removing element at index 1 be: ") ;
        System.out.println(str) ;




        

    }
    
}
