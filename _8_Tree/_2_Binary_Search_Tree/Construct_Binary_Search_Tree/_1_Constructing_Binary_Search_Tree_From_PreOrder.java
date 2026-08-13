// package _8_Tree._2_Binary_Search_Tree.Construct_Binary_Search_Tree;

class Node1{
    int data ;

    Node1 left ;
    Node1 right ;

    public Node1(int data){
        this.data = data ;
        this.left = null ;
        this.right = null ;
    }
}
public class _1_Constructing_Binary_Search_Tree_From_PreOrder {

    // Node1 root ;

    public Node1 constructBinarySearchTree(int[] preorder , int start , int end){
        if(start > end){
            return null ;
        }

        Node1 root  = new Node1(preorder[start])  ;
        int i ;

        for(i= start+1 ; i<= end ; i++){
            if(preorder[i] > root.data){
                break ;
            }
        }

        root.left = constructBinarySearchTree(preorder, start+1 , i-1)  ;
        root.right = constructBinarySearchTree(preorder, i , end)  ;

        return root ;
    }

    public void inorder(Node1 root){
        if(root == null){
            return ;
        }

        inorder(root.left)  ;
        System.out.print(root.data + " ")  ;
        inorder(root.right)  ;
    }
    public static void main(String [] args){
        System.out.println("1 Program to construct a binary search tree from preorder.")  ;

        _1_Constructing_Binary_Search_Tree_From_PreOrder obj = new _1_Constructing_Binary_Search_Tree_From_PreOrder()  ;


        int[] preorder = {10, 5, 1, 7, 40, 50};

        Node1 root = obj.constructBinarySearchTree(preorder , 0 , preorder.length-1)  ;

        System.out.println("Inorder Traversal : ")  ;

       

        obj.inorder(root)  ;




    }
    
}
