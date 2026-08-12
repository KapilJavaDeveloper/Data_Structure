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

public class _1_Insertion_In_Binary_Search_Tree{

    Node1 root ;

    public void constructBinarySearchTree(int[] arr){

        for(int a : arr){
            root = insert(root , a) ;
        }
    }

    public Node1 insert(Node1 root , int data){

        if(root == null){
            return new Node1(data)  ;
        }

        if(data < root.data){
            root.left = insert(root.left , data)  ;
        }
        else if(data > root.data){
            root.right = insert(root.right , data)  ;
        }

        return root ;

    }

    public void inorder(Node1 root){
        if(root == null){
            return ;
        }

        inorder(root.left)  ;
        System.out.print(root.data + " ") ;
        inorder(root.right)  ;

    }
    public static void main(String [] args){
        System.out.println("1 Program Insertion in Binary Search Tree.")  ;

        _1_Insertion_In_Binary_Search_Tree obj = new _1_Insertion_In_Binary_Search_Tree()  ;

        int[] arr = {50, 30, 70, 20, 40, 60, 80};

        obj.constructBinarySearchTree(arr);

        obj.inorder(obj.root)  ;

    }
}