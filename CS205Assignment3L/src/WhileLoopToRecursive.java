
public class WhileLoopToRecursive {
	public static boolean binarySearch(int[] a, int i, int j, int target) {
		
		if (i > j)  return false;
		else {
			int mid = (i+j)/2;
			if (target == a[mid])
				return true;
			else if(target < a[mid])
				j = mid-1;
			else
				i = mid +1;
			return binarySearch(a, i, j, target);
		}	
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4,5,6,7,8,9};
		int target1 = 10;
		int target2 = 3;
		int target3 = 8;
		System.out.println(binarySearch(a, 0, a.length-1, target1));
		System.out.println(binarySearch(a, 0, a.length-1, target2));
		System.out.println(binarySearch(a, 0, a.length-1, target3));
		
	}//main

}//class
