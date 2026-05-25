import java.util.Scanner ;
public class Arrays_Traversal{
    public static void main(String [] args){

        int[] arr = new int [] {1,2,3,4,5,6,7,8}  ;

        Scanner sc = new Scanner(System.in)  ;
        System.out.println("Enter a index from where you want to traverse array: ") ;
        int start = sc.nextInt()  ;

       

        if(start < arr.length){

            for(int i=start ; i<arr.length ; i++){
                System.out.print(arr[i] + " ") ;

            }

        }
        else{
            System.out.println("Arrays size is less than "+ start) ;
        }


    }
}