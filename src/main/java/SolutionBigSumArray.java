import java.util.Scanner;

public class SolutionBigSumArray {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}

		getSum(arr);
	}

	static void getSum(int arr[]) {

		long sum = 0;

		for (int ar : arr) {
			sum += ar;
		}

		System.out.print(sum);

	}

}
