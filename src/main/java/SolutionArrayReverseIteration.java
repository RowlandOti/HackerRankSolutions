import java.util.*;
public class SolutionArrayReverseIteration {

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        int n = in.nextInt();
	        int arr[] = new int[n];

	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }

	        for(int counter=arr.length - 1; counter >= 0;counter--){
	        	int printIndex = arr[counter];
	        	// Print vertically
	        	System.out.println(printIndex);
	        	// Print horizontally
	        	//System.out.print(printIndex);
	        }
	   }
}
