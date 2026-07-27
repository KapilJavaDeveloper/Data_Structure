import java.util.Arrays ;
public class _2_Binary_Search {

    public static void binary_Search(int [] array , int data, int start , int end){

        
        while(start < end){
            int mid = (start+end)/2 ;


            if(array[mid]  == data ){
                System.out.println(data + " Found at index "+ mid) ;
                return ;
            }
            if(array[mid] > data){
                end = mid-1 ;
                
            }
            else if(array[mid] < data){
                start = mid+1 ;
                
            }


        }


        System.out.println(data + " Not Found")  ;

    }
    public static void main(String [] args){
        System.out.println("2 Program for Binary search.") ;

        int[] array = new int[]  {5, 9 , 17 , 23 , 25 , 45 , 59 , 63 , 71 , 89}  ;
        int data = 5 ;


        System.out.println("Array be: "  + Arrays.toString(array)) ;
        System.out.println("Searched Element be: "+ data)  ;

        binary_Search(array , data , 0, array.length) ;

    }
    
}
