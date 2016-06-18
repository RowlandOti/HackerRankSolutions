
public class MinionHierarchyProblem {

	public static void main(String[] args) {
		System.out.println("No. of Mininions of Firm Alphabet "+answer(4));
	}

	public static int answer(int x) {


			if(x>10 || x<=0) {
				System.out.println("Invalid Input");
				return 0;
			}

			int total = 0;
			for(int i=0;i<=x;i++) {
				total += Math.pow(7,i);
				System.out.println("" +total);
			}
			return total;


		}

}
