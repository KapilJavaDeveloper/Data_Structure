// package _1_Binary_Tree;
import java.util.HashMap ;

class Node{
    int data ;
    Node left ;
    Node right ;

    public Node(int data){
        this.data  = data ;
        this.left = null ;
        this.right = null ;
    }
}

public class _1_Construct_Binary_Tree_From_PreOorder_And_Inorder {

    HashMap<Integer , Integer> map = new HashMap<>()  ;

    public Node binaryTree(int [] inOrder , int[] preOrder){

        for(int i=0 ; i<inOrder.length ; i++){
            map.put(inOrder[i] ,  i)  ;
        }

        return buildBinaryTree(inOrder , preOrder , 0 , inOrder.length-1)  ;


    }

    int preIndex = 0 ;

    public Node buildBinaryTree(int[] inOrder , int[] preOrder , int left , int right){
        if(left> right ){
            return null ;
        }

        int rootValue = preOrder[preIndex] ;
        preIndex++ ;
        Node root = new Node(rootValue)  ;

        int rootIndex = map.get(rootValue)  ;


        root.left = buildBinaryTree(inOrder , preOrder , left , rootIndex-1)  ;
        root.right = buildBinaryTree(inOrder , preOrder , rootIndex+1 , right)  ;

        return root ;
    }

    public void postOrder(Node root){

        if(root == null){
            return ;
        }

        postOrder(root.left) ;
        postOrder(root.right)  ;
        System.out.print(root.data + " ")  ;
    }
    public static void main(String []  args){
        System.out.println("1 Program Construct Binary Tree From PreOrder and Inorder.")  ;

        int[] inOrder = {4, 2, 5, 1, 6, 3}; 
        int[] preOrder = {1, 2, 4, 5, 3, 6}; 

        _1_Construct_Binary_Tree_From_PreOorder_And_Inorder obj = new _1_Construct_Binary_Tree_From_PreOorder_And_Inorder()  ;


        Node root = obj.binaryTree(inOrder ,preOrder)  ;

        System.out.println("PostOrder be: ") ;
        obj.postOrder(root)  ;



    }
    
}
