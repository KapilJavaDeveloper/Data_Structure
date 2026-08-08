import java.util.HashMap ;

class Node2{
    int data ;
    Node2 left ;
    Node2 right ;

    public Node2(int data){
        this.data =  data ;

        this.left = null ;
        this.right = null ;
    }

}
public class _2_Construct_Binary_Tree_From_PostOrder_And_InOrder{

    int postIndex = 0 ;

    HashMap<Integer , Integer> map = new HashMap<Integer , Integer>()  ;

    public Node2 binaryTree(int[] inorder , int[] postorder){
        for(int i=0 ; i<inorder.length ; i++){
            map.put(inorder[i]  , i)  ;
        }

        postIndex = postorder.length-1 ;

        return buildTree(inorder , postorder , 0 , inorder.length-1)  ;
    }


    public Node2 buildTree(int[] inorder , int[] postorder , int left , int right){
        if(left>right){
            return null ;
        }

        
        int rootValue = postorder[postIndex--]  ;
        Node2 root = new Node2(rootValue)  ;

        int rootIndex = map.get(rootValue)  ;

        root.right = buildTree(inorder , postorder , rootIndex+1 , right)  ;
        root.left = buildTree(inorder , postorder ,left , rootIndex-1)  ;

        return root ;
    }

    public void preorder(Node2 root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + " " )  ;
        preorder(root.left)  ;
        preorder(root.right)  ;
    }
    public static void main(String [] args){
        System.out.println("1 Program to construct Binary Tree from PostOrder and PreOrder.")  ;

        int[] inorder = {4, 2, 5, 1, 6, 3}; 
        int[] postorder = {4, 5, 2, 6, 3, 1};

        _2_Construct_Binary_Tree_From_PostOrder_And_InOrder obj = new _2_Construct_Binary_Tree_From_PostOrder_And_InOrder()  ;

        Node2 root = obj.binaryTree(inorder , postorder)  ;

        System.out.print("PreOrder be: ")  ;
        obj.preorder(root)  ;
    }
}