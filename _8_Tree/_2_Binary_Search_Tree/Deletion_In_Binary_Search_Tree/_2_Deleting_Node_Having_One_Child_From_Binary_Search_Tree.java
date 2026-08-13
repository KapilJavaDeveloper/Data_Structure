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

public class _2_Deleting_Node_Having_One_Child_From_Binary_Search_Tree {

    Node2 root ;

    public Node2 insert(Node2 root , int data){
        if(root==null){
            return new Node2(data)  ;
        }

        if(data < root.data){
            root.left = insert(root.left , data)  ;
        }
        else if(data > root.data){
            root.right = insert(root.right , data)  ;
        }

        return root ;
    }

    public void inorder(Node2 root){
        // System.out.println("Hii")   ;
        if(root==null){
            return ;
        }

        inorder(root.left)  ;
        System.out.print(root.data + " ")  ;
        inorder(root.right)  ;
    }

    public Node2 deleteNode(Node2 root , int data){
        if(root == null){
            return null ;
        }

        if(data < root.data){
            root.left = deleteNode(root.left , data)  ;
        }
        else if(data > root.data){
            root.right = deleteNode(root.right , data)  ;
        }

        else{
            if(root.left == null && root.right == null){
                System.out.println(data + " Node have Zero child.")  ; 
                return null ;
            }

            if(root.left == null){
                return root.right ;
            }

            if(root.right == null){
                return root.left ;

            }
        }

        return root ;

    }
    public static void main(String [] args){
        System.out.println("2 Program Deleting Node Having One Child From Binary Search Tree.") ;

        _2_Deleting_Node_Having_One_Child_From_Binary_Search_Tree obj = new _2_Deleting_Node_Having_One_Child_From_Binary_Search_Tree()  ;

        int[] arr = {50 , 30 , 70 , 60 , 65, 80}  ;

        for(int a : arr){
            obj.root = obj.insert(obj.root ,a)  ;
        }

        obj.inorder(obj.root)  ;

        obj.deleteNode(obj.root , 60) ;

        System.out.println("\nAfter deleting Node 60: ")  ;
        obj.inorder(obj.root)  ;
    }
    
}
