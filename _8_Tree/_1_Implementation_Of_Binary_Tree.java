class Node1{
    int data ;
    Node1 left ;
    Node1 right ;

    

    public Node1(int data){
        this.data = data ;
    }
}
public class _1_Implementation_Of_Binary_Tree{
    Node1 root ;

    public _1_Implementation_Of_Binary_Tree(){
        root = null ;
    }

    public void insert(int data){
        root = recursion(root , data)  ;
    }

    public Node1 recursion(Node1 root , int data){
        if(root == null){
            root = new Node1(data)   ;
            return root ;
        }

        if(data < root.data){
            root.left = recursion(root.left , data)  ;
        }
        else{
            root.right = recursion(root.right, data)  ;
        }

        return root ;
    }

    public void preorder_Traversal(Node1 root){
        if(root !=null){
            System.out.print(root.data + " ")  ;
            preorder_Traversal(root.left)  ;
            preorder_Traversal(root.right)  ;

        }
    }

    public void inorder_Traversal(Node1 root){

        if(root != null){
            inorder_Traversal(root.left)  ;
            System.out.print(root.data +" ")  ;
            inorder_Traversal(root.right)  ;
        }

    }

    public void postorder_Traversal(Node1 root){
        if(root != null){
            postorder_Traversal(root.left)  ;
            postorder_Traversal(root.right)  ;
            System.out.print(root.data  + " ")  ;
        }
    }

    public static void main(String[]  args){
        System.out.println("1 Program Implementation of Binary Tree.")  ;

        _1_Implementation_Of_Binary_Tree obj  = new _1_Implementation_Of_Binary_Tree()  ;

        obj.insert(50);
        obj.insert(30);
        obj.insert(70);
        obj.insert(20);
        obj.insert(40);
        obj.insert(60);
        obj.insert(80);


        System.out.print("\nPre order be: ") ;
        obj.preorder_Traversal(obj.root)  ;
        
        
        
        System.out.print("\nIn order be: ") ;
        obj.inorder_Traversal(obj.root)   ;
        
        
        System.out.print("\nPost order be: ") ;
        obj.postorder_Traversal(obj.root)  ;


    }
}