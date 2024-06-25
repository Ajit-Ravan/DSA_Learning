package Step_1_Basics.Basic_Maths;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153;
		int count = 1;
		int rem = 0, temp = num, sum = 0, duplicateNum = num;
		// count of digits
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			if (rem == 0)
				continue;
			if (temp % rem == 0) {
				count++;
			}
		}
//Amstrong number is addition of remainders ^ digitcount, if addition == original num then it is amstrong number
		while (duplicateNum > 0) {
			rem = duplicateNum % 10;
			if (rem == 0)
				continue;
			sum += Math.pow(rem, count);
			duplicateNum = duplicateNum / 10;

		}
		if (temp == sum)
			System.out.println(temp + " != " + sum + " it is an Amstrong number");
		else
			System.out.println(temp + " != " + sum + " it is not an Amstrong number");

	}

}
