package Step_1_Basics.Recursion;

public class PalindromeString {
	public static boolean isPalindrome(String s) {
		String str = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			str += s.charAt(i);
		}
		str = str.replaceAll("[^a-zA-Z0-9]", " ");
		str = str.replaceAll(" ", "");

		s = s.replaceAll("[^a-zA-Z0-9]", " ");
		s = s.replaceAll(" ", "");
		System.out.println(str);
		System.out.println(s);

		if (str.equals(s)) {
			System.out.println(str);
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));

	}

}
