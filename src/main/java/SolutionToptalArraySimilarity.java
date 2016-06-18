import java.util.Arrays;

public class SolutionToptalArraySimilarity {

	public static void main(String[] args) {

		SolutionToptalArraySimilarity sol = new SolutionToptalArraySimilarity();
		int[] A = {5, 5, 1, 7, 2, 3, 5};
		int k = sol.solution(5, A);
		System.out.print(k);
	}

	public int solution(int X, int[] A) {

		int k = getK(A);
		int n = getN(A);

		int[] arrTop = getTopArray(A);
		int[] arrBottom = getBottomArray(A);

		int z  = arrTop[arrTop.length -1] + arrBottom[arrTop.length -1];


		return z;
	}

	public int getK(int[] A) {
		int sum = getSum(A);
		int k = sum / 2;
		return k;
	}

	public int getN(int[] A) {
		int n = A.length;
		return n;
	}

	public int getSum(int arr[]) {
		int sum = 0;
		for (int ar : arr) {
			sum += ar;
		}
		return sum;
	}

	public int[] getTopArray(int[] A){
		int[] arrTop = new int[getK(A)];
		for (int arr_i = 0; arr_i < getK(A) - 1; arr_i++) {
			arrTop[arr_i] = A[arr_i];
		}
		return arrTop;
	}

	public int[] getBottomArray(int[] A){
		int[] arrBottom = new int[getN(A)];
		for (int arr_i = getK(A); arr_i < getN(A) - 1; arr_i++) {
			arrBottom[arr_i] = A[arr_i];
		}
		return arrBottom;
	}
}
