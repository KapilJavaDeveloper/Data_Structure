class Node3{
    int data ;

    Node3 left ;
    Node3 right ;

    public Node3(int data){
        this.data = data ;
        this.left = null ;
        this.right = null ;
    }    
}
public class _3_Traversal_Of_Binary_Tree {

    Node3 root = null ;

    public void create(int data){
        root = insert(root , data)  ;
    }

    public Node3 insert(Node3 root ,int data){
        if(root==null){
            root = new Node3(data) ;
            return root ;
        }

        if(data < root.data){
            root.left = insert(root.left , data)  ;
        }
        else{
            root.right = insert(root.right , data)  ;
        }

        return root ;
    }

    public void preOrder(Node3 root){
        if(root == null){
            return ;
        }
        System.out.print(root.data + " ")  ;
        preOrder(root.left)  ;
        preOrder(root.right)  ;
    }

    public void inOrder(Node3 root){
        if(root == null){
            return ;
        }
        

            inOrder(root.left)  ;
            System.out.print(root.data + " ")  ;
            inOrder(root.right)  ;
        
    }

    public void postOrder(Node3 root){
        if(root == null){
            return ;
        }
        postOrder(root.left) ;
        postOrder(root.right)  ;
        System.out.print(root.data + " ")  ;
    }

    public static void main(String [] args){

        System.out.println("3 Program Traversal Of Binary Tree.") ;

        _3_Traversal_Of_Binary_Tree tree = new _3_Traversal_Of_Binary_Tree() ;

        tree.create(4) ;
        tree.create(3) ;
        tree.create(10)  ;
        tree.create(9)  ;
        tree.create(2)  ;

        System.out.print("Pre Order Traversal of Tree be: " )  ;
        tree.preOrder(tree.root) ;

        System.out.print("\nInorder Traversal of Tree be: ")  ;
        tree.inOrder(tree.root)  ;

        System.out.print("\nPostOrder Traversal of Tree be: ")  ;
        tree.postOrder(tree.root)  ;
    }
    
}
