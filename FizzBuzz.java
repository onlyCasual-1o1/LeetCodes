import java.util.List;
import java.util.ArrayList;

public class FizzBuzz {
	
	static List<String> fizzBuzz(int n) {
		int i;
		List<String> stringNums = new ArrayList<>();
		
		for(i = 1; i <= n; i++) {
			String numToString = String.valueOf(i);
			if(i % 3 == 0 && i % 5 == 0) {
				numToString = "FizzBuzz";
			}else if(i % 3 == 0) {
				numToString = "Fizz";
			}else if(i % 5 == 0) {
				numToString = "Buzz";
			}
			
			stringNums.add(numToString);
		}
		return stringNums;
	}

	public static void main(String[] args) {
		
		System.out.print(fizzBuzz(15));

	}

}
