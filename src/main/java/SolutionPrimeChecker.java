import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import static java.lang.System.in;


public class SolutionPrimeChecker {

	public static void main(String[] args) {
		try{

		BufferedReader br= new BufferedReader(new InputStreamReader(in));

		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		SolutionPrimeChecker.Prime ob= new SolutionPrimeChecker().new Prime();

		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());

		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	private class Prime {

		public void checkPrime(int ...arr) {

			for(int i=0;i<arr.length;i++)
	        {
				int num = arr[i];

				//REMEMBER: 1 is not a Prime Number
				if(isPrime(num) && num != 1) {

					System.out.print(num+ " ");

				}
	        }

			System.out.print("\n");
		}

		 //This method isPrime() will determine if a given number is either prime or not.
		  public  boolean isPrime( int num )
		  {
		    boolean primality = true;

		    //Sets and stores the "upper boundary divisor" as the √n in the variable "limit" of type integer.
		     int limit = (int) Math.sqrt ( num );

		    //Our boundary is set with this range now
		    for ( int i = 2; i <= limit; i++ )
		    {
		      //Divides variable "num" by the range of divisors set above to resolve "primality"
		      if ( num % i == 0 )
		      {
		    	//primality is true
		        primality = false;
			break;
		      }
		    }
		    //primality is true
		    return primality;
		  }

	}

}
