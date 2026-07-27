import java.util.Arrays ;
public class _1_Linear_Searching{

    public static void linearSearch(int[] array , int data){

        for(int i=0 ; i<array.length ; i++){
            if(array[i]  == data){
                System.out.println("Element "+ data + " is found at index "+ i) ;
                return ;
            }
        }
            System.out.println(data + " element not found") ;
    }
    public static void main(String [] args){
        System.out.println("1 Program Linear Seach") ;

        int[] array = new int[] {15, 5 , 20 , 35 , 2 , 42 , 67, 17}  ;
        int data = 42 ;


        System.out.println("Array be: " + Arrays.toString(array)) ;
        System.out.println("Searched eleemnt be: " + data)  ;

        linearSearch(array, data);

    }
}