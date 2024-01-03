package Step_04_BinarySearch_Session_02_part1;

public class Que_UpperBoundOfX {

	public static int upperBound(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] <= target) {
				left = mid + 1;
			} else {
				if (mid == 0) {
					return 0;
				} else {
					if (arr[mid - 1] <= target) {
						return mid;
					} else {
						right = mid - 1;
					}
				}
			}
		}
		return left;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 5, 6, 6, 7, 7, 9 };
		int target = 10;
		int upperBoundIndex = upperBound(arr, target);
		if (upperBoundIndex < arr.length) {
			System.out.println("Upper bound of " + target + " is at index " + upperBoundIndex);
		} else {
			System.out.println("Upper bound of " + target + " is at index " + arr.length);
		}

	}

}
