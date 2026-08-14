
class _1_Insertion_In_AVL_Tree{

    static class Node1{
    Node1 left ;
    Node1 right ;

    int data ;

    int height ;

    public Node1(int data){
        this.data = data ;
        this.left = null ;
        this.right = null ;
        this.height = 1 ;
    }
}

    Node1 root ;

    public int height(Node1 node){
        if(node == null){
            return 0 ;
        }

        return node.height ;

    }

    public int max(int a , int b){
        return (a>b) ? a : b ;
    }

    public int getBalance(Node1 node){
        if(node == null){
            return 0 ;
        }

        return height(node.left) - height(node.right) ;
    }

    public void insert(int data){
        root = insert(root , data)  ;
    }

    public Node1 insert(Node1 node , int data){
        if(node == null){
            return new Node1(data) ;
        }

        if(data < node.data){
            node.left = insert(node.left, data)  ;
        }

        else if(data > node.data){
            node.right = insert(node.right , data)  ;
        }
        else{
            return node ;
        }

        node.height = 1 + max(height(node.left)  , height(node.right))  ;

        int balance = getBalance(node)  ;

        // LL Case

        if(balance > 1 && data < node.left.data){
            return rightRotate(node)  ;
        }

        // RR Case

        if(balance < -1 && data > node.right.data){
            return leftRotate(node) ;
        }

        // LR Case
        if(balance > 1 && data > node.left.data){
            node.left = leftRotate(node.left)  ;
            return rightRotate(node)  ;
        }


        // RL Case
        if(balance <-1 && data < node.right.data){
            node.right = rightRotate(node.right)  ;
            return leftRotate(node)  ;

        }

        return node;





    }

    public Node1 rightRotate(Node1 root){

        Node1 lefty = root.left ;
        Node1 temp = lefty.right ;

        lefty.right = root ;
        root.left = temp ; 

        root.height = 1 + max(height(root.left)  , height(root.right))  ;
        lefty.height = 1 + max(height(lefty.left)  , height(lefty.right))  ;

        return lefty ;
    }

    public Node1 leftRotate(Node1 x){

        Node1 y = x.right ;
        Node1 temp = y.left ;

        y.left = x ;
        x.right = temp ;

        x.height = 1 + max(height(x.left) , height(x.right))  ;
        y.height = 1 + max(height(y.left)  , height(y.right))  ;

        return y  ;

    }

    public void inorder(Node1 root){
        if(root == null){
            return ; 
        }
        inorder(root.left)  ;
        System.out.print(root.data + " ")  ;
        inorder(root.right)  ;
    }

    public void preorder(Node1 root){
        if(root == null){
            return ;
        }

        System.out.print(root.data + " ")  ;
        preorder(root.left)  ;
        preorder(root.right)  ;
    }

    public void postorder(Node1 root){
        if(root == null){
            return ;
        }

        postorder(root.left)  ;
        postorder(root.right)  ;
        System.out.print(root.data + " ")  ;
    }


    public static void main(String [] args){
        System.out.println("1 program Insertion in AVL Tree.")  ;

        int[] arr = {
            14, 17, 11, 7, 53, 4, 13,
            12, 8, 60, 19, 16, 20
        };

        _1_Insertion_In_AVL_Tree obj = new _1_Insertion_In_AVL_Tree()  ;

        for(int a : arr){
            obj.insert(a)  ;
        }
        
        System.out.println("Inorder be: ")  ;
        obj.inorder(obj.root)  ;
        
        System.out.print("\nPreorder be: ")  ;
        obj.preorder(obj.root)  ;

        System.out.println("\nPostorder be: ")  ;
        obj.postorder(obj.root)  ;

    }
}