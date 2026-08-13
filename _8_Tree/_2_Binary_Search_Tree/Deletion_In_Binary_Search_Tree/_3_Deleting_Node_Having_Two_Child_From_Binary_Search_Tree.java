class Node3{
    Node3 left ;
    Node3 right ;

    int data ;

    public Node3(int data){
        this.data = data ;
        this.left = null ;
        this.right = null ;
    }
}

public class _3_Deleting_Node_Having_Two_Child_From_Binary_Search_Tree {

    Node3 root ;

    public Node3 insert(Node3 root , int data){
        if(root == null){
            return new Node3(data)  ;
        }

        if(data < root.data){
            root.left = insert(root.left , data) ;
        }

        else if(data > root.data){
            root.right = insert(root.right , data)  ;
        }

        return root ;
    }

    public void inorder(Node3 root){
        if(root == null){
            return ;
        }

        inorder(root.left) ;
        System.out.print(root.data + " ")  ;
        inorder(root.right)  ;
    }

    public Node3 findMin(Node3 root){
        if(root.left == null){
            return root ;
        }

        return findMin(root.left)  ;
    }

    public Node3 delete(Node3 root , int data){
        if(root == null){
            return null ;
        }

        if(data < root.data){
            root.left = delete(root.left , data)  ;
        }
        else if(data > root.data){
            root.right = delete(root.right , data)  ;
        }

        else{

            if(root.left == null && root.right == null){
                return null ;
            }

            if(root.left == null){
                return root.right ;
            }

            if(root.right == null){
                return root.left ;
            }

            Node3 successor = findMin(root.right)  ;

            root.data = successor.data  ;

            root.right = delete(root.right , successor.data)  ;

        }

        return root ;
    }

    
    public static void main(String [] args){
        System.out.println("3 Program Delete Node Having Two Child From Binary Search Tree.")  ;

        _3_Deleting_Node_Having_Two_Child_From_Binary_Search_Tree obj = new _3_Deleting_Node_Having_Two_Child_From_Binary_Search_Tree()  ;

        int[]  arr = {50 , 30 , 70 , 20 , 40 , 60 , 80}  ;

        for(int a : arr){
            obj.root = obj.insert(obj.root , a)  ;
        }
        System.out.println("Before deletion : ") ;
        obj.inorder(obj.root)  ;


        obj.root = obj.delete(obj.root , 50)  ;

        System.out.println("\nAfter deletion : ")  ;
        obj.inorder(obj.root)  ;

    }
    
}
