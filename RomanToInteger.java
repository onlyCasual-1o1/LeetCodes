import java.util.HashMap;

public class RomanToInteger {
	
	public static int romanToInt(String s) {
		int i;
		int result = 0;
		
		HashMap<Character, Integer> romanInt = new HashMap<Character, Integer>();
		romanInt.put('I', 1);
		romanInt.put('V', 5);
		romanInt.put('X', 10);
		romanInt.put('L', 50);
		romanInt.put('C', 100);
		romanInt.put('D', 500);
		romanInt.put('M', 1000);
		
		for(i = 0; i < s.length(); i++) {
			if(i < s.length() - 1 && romanInt.get(s.charAt(i)) < romanInt.get(s.charAt(i + 1))) {
				result -= romanInt.get(s.charAt(i));
			}else{
				result += romanInt.get(s.charAt(i));
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
	
		System.out.print(romanToInt("XIV"));
	}

}
