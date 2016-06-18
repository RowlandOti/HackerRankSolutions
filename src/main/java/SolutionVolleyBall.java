import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class SolutionVolleyBall {

	 public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
	        final String fileName = System.getenv("OUTPUT_PATH");
	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        int res;
	        int _A;
	        _A = Integer.parseInt(in.nextLine());

	        int _B;
	        _B = Integer.parseInt(in.nextLine());

	        res = volleyball(_A, _B);
	        bw.write(String.valueOf(res));
	        bw.newLine();

	        bw.close();
	    }


	 /*
	  * Complete the function below.
	  */

	     static int volleyball(int A, int B) {

	    	 if( A==0 || B==0) return 0;

	    	 int winRatio1 = 25/24;
	    	 int winRatio2 = 22/25;

	    	 int diff = A -B;

	    	 int ratioA2B = A/B;
	    	 int ratioB2A = B/A;

	    	 if(A<B || B< A) {

	    	 }

	    	 if(Math.abs(diff) > 1) return 0;


			return B;
	     }

	}


