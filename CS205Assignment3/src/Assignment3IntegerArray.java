
public class Assignment3IntegerArray {

	public static boolean ifSumOfZero(int [] a, int i, int j) {
		if (i > j) return false;
		if ((a[i] + a[j]) == 0){
			return true;
		}
		else
			return ifSumOfZero(a, i+1, j-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
		int [] b = {1, 2, 3, 4, 5, 6, 7, 8, -1,};
		System.out.println(ifSumOfZero(a, 0, a.length-1));
		System.out.println(ifSumOfZero(b, 0, b.length-1));
	}//main

}//class
