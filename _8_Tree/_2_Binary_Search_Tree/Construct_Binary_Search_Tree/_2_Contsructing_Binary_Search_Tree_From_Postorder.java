// package _8_Tree._2_Binary_Search_Tree.Construct_Binary_Search_Tree;

class Node2{
    int data ;

    Node2 left ;
    Node2 right ;

    public Node2(int data){
        this.data = data ;
        this.left = null ;
        this.right = null ;
    }
}
public class _2_Contsructing_Binary_Search_Tree_From_Postorder {

    static int index ;

    public Node2 constructBinarySearchTree(int[] postorder , int min , int max){

       if(index < 0){
        return null ;
       }

       int value = postorder[index] ;

       if(value < min || value > max){
        return null ;
       }
       Node2 root = new Node2(value)  ;
       
       index-- ;

       root.right = constructBinarySearchTree(postorder , value+1 , max) ;
       root.left = constructBinarySearchTree(postorder, min , value-1)  ;

        return root ;

    }

    public void inorder(Node2 root){

        if(root == null){
            return ;
        }

        inorder(root.left)  ;
        System.out.print(root.data + " ")  ;
        inorder(root.right)  ;

    }

    public static void main(String [] args){

        System.out.println("2 Program Constructing Binary Search Tree From Postorder.")  ;

        int[] postorder = {1, 7, 5, 50, 40, 10};

        index = postorder.length-1 ;

        

        _2_Contsructing_Binary_Search_Tree_From_Postorder obj = new _2_Contsructing_Binary_Search_Tree_From_Postorder()  ;

        Node2 root = obj.constructBinarySearchTree(postorder, Integer.MIN_VALUE , Integer.MAX_VALUE)  ;

        obj.inorder(root)  ;
        
    }
    
}
