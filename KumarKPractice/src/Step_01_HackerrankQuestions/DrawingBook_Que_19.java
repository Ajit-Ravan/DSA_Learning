package Step_01_HackerrankQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class DrawingBook_Que_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		if (n % 2 != 0) {
			n = n + 1;
		} else if (n % 2 == 0) {
			n += 2;
			System.out.println(n);
		}
		System.out.println(n);
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i;
		}

		// searching from front
		int front = 0, rear = 0;
		for (int i = 0; i < n; i += 2) {
			if (arr[i] != p && arr[i + 1] != p) {
				front++;
//				System.out.println(front);
			} else {
				break;
			}
		}
		//searching rear
		for (int i = n - 1; i >= 0; i -= 2) {
			if (arr[i] != p && arr[i - 1] != p) {
				rear++;
//				System.out.println(rear);
			} else {
				break;
			}
		}
		int res = 0;
		System.out.println(front + ":f r:" + rear);

		if (front < rear) {
			res = front;
		} else if (rear < front) {
			res = rear;
		} else if (front == rear) {
			res = front;
		}

		System.out.println(res);

	}

}
