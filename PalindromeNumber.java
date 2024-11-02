package Easy;

public class PalindromeNumber {

	static boolean isPalindrome(int x) {
		String temp = String.valueOf(x);
		String temp2 = "";
		
        int i;
       
        for(i = temp.length(); i > 0; i--) {
        	temp2 += temp.charAt(i - 1);
        	
        }
       
        return temp.equals(temp2);
    }
	
	public static void main(String[] args) {
		System.out.print(isPalindrome(202));
		
	}

}
