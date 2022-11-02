
public class Solution {

	public static void main(String[] args) {//q125
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("0P"));
	}
	public static boolean isPalindrome(String s) {
		s=s.toLowerCase();
			s=removeSpaces(s);
		
		String temp="";
		int i=s.length();
		while(i>0) {
			temp+=s.charAt(i-1);
			i--;
		}
		if(temp.equals(s)) {
			return true;
		}
		return false;
	}
	public static String removeSpaces(String s) {
		int i=s.length(); String temp="";
		while (i>0) {
			if(Character.isLetterOrDigit(s.charAt(i-1))) {
				temp+=s.charAt(i-1);
			}
			i-=1;
		}
		return temp;
		}

}
