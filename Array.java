/*Sum of the Array Elements with Exception*/
import java.util.*;

//Array class
class Array{
	//Main Method
    public static void main(String[] args) {
    	//Array of size 10
    	int arr[] = new int[10];
    	//Initialize sum equals to 0
    	int sum = 0;
    	
    	System.out.println ("Enter the 10 elements of array :");
    	Scanner sc = new Scanner(System.in);
    	//Taking the Array elements 
    	for (int i = 0; i<10; i++){
    		arr[i]=sc.nextInt();
    	}
    	System.out.println ("----------------------------");
    	//Printing Array elements
    	System.out.println ("Array Elements are: ");
        for(int i = 0; i <=10; i++){
        	//Try block to detect exception
        	try{
        		System.out.println (arr[i]);
        		sum+=arr[i];
        	//Catch block to handle exception
        	}catch(IndexOutOfBoundsException e){
        		System.out.println("Error Type: " + e);
        	}   
        }
        
        System.out.println ("----------------------------");
        //Printing sumation of array elements
        System.out.println("Total of Array Elements = " + sum);
    }
}