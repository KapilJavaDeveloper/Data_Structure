import java.util.HashMap ;
class Node3{
    char data ;
    Node3 left ;
    Node3 right ;

    public Node3(char data){
        this.data = data ;
        this.left = null ;
        this.right = null ;
    }
}
public class _3_Construct_Binary_Tree_From_Preorder_And_Postorder {

    HashMap<Character, Integer> postMap = new HashMap<>()  ;
    int preIndex ;


    public Node3 constructFromPrePost(char[] preorder , char[] postorder){

        for(int i=0 ; i<postorder.length ; i++){
            postMap.put(postorder[i] , i) ;
        }

        return buildTree(preorder , postorder , 0, postorder.length-1)  ;

    }

    public Node3 buildTree(char[] preorder , char[] postorder , int postStart , int postEnd){

        if(postStart > postEnd){
            return null ;
        }

        Node3 root = new Node3(preorder[preIndex])  ;
        preIndex++ ;

        // System.out.println("After preIndex++ , root.data :  " + root.data) ;
        // System.out.println("After preIndex++ ,   preorder[preIndex]:  " + preorder[preIndex]) ;

        if(postStart == postEnd){
            return root ;
        }

        char leftRoot = preorder[preIndex]  ;

        int index = postMap.get(leftRoot)  ;

        root.left = buildTree(preorder , postorder , postStart , index)  ;
        root.right = buildTree(preorder , postorder , index+1 , postEnd-1)  ;

        return root ;
    }

    public void inOrder(Node3 root){
        if(root == null){
            return ;
        }

        inOrder(root.left)  ;
        System.out.print(root.data + " ")  ;
        inOrder(root.right)  ;

    }
    public static void main(String [] args){
        System.out.println("3 Program to Construct a Binary Tree from Postorder and Preorder.")  ;

        char[] preorder = {'F', 'B' , 'A' , 'D' , 'C' , 'E' , 'G' , 'I' , 'H'} ;  
        char[] postorder = {'A', 'C' , 'E' , 'D' , 'B' , 'H' , 'I' , 'G' , 'F'} ;

        _3_Construct_Binary_Tree_From_Preorder_And_Postorder obj = new _3_Construct_Binary_Tree_From_Preorder_And_Postorder()  ;

        
        Node3 root = obj.constructFromPrePost(preorder , postorder)  ;

        obj.inOrder(root)  ;

    }
    
}
