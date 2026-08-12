// package Deletion_In_Binary_Search_Tree;

class Node1{
    Node1 left ;
    Node1 right ;
    int data ;

    public Node1(int data){
        this.data = data;
        this.left = null ;
        this.right = null ;
    }

}
public class _1_Deleting_Leaf_Node_From_Binary_Search_Tree {
    Node1 root ;

    public Node1 insert(Node1 root , int data){
        if(root == null){
            return new Node1(data)  ;
        }

        if(root.data < data){
            root.right = insert(root.right , data)  ;
        }
        else if(root.data > data){
            root.left = insert(root.left, data)  ;
        }

        return root ;
    }

    public void inorder(Node1 root){
        if(root==null){
            return  ;
        }

        inorder(root.left)  ;
        System.out.print(root.data +  " ") ;
        inorder(root.right)  ;
    }

    public Node1 delete_Node(Node1 root , int data){
        if(root== null){
            return null ;
        }

        if(root.data > data){
            root.left =  delete_Node(root.left , data)  ;
        }
        else if(root.data < data){
            root.right =  delete_Node(root.right , data)  ;
        }

        else{
            if(root.left == null && root.right ==null){
                return null ;
            }

            System.out.println(data + " is not the leaf node.")  ;
        }


        return root ;


    }


    public static void main(String [] args){
        System.out.println("1 Deleting Leaft Node From Binary Search Tree.")  ;

        _1_Deleting_Leaf_Node_From_Binary_Search_Tree obj = new _1_Deleting_Leaf_Node_From_Binary_Search_Tree() ;

        int[] arr = {50, 30, 70, 20, 40, 60, 80};

        for(int a : arr){
            obj.root = obj.insert(obj.root , a)  ;
        }

        System.out.println("Before Tree")  ;
        obj.inorder(obj.root) ;


        System.out.println()  ; 
        obj.root = obj.delete_Node(obj.root , 40)  ;
        System.out.println("\nAfter Tree")  ;
        obj.inorder(obj.root) ;




    }
    
}
