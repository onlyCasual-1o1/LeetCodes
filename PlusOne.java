package Easy;
import java.util.Arrays;

public class PlusOne {
	
	public static int[] plusOne(int[] digits) {
       int i;
       
       for(i = digits.length - 1; i >= 0; i--) {
    	   if(digits[i] < 9) {
    		   digits[i]++;
    		   return digits;
    	   }
    	   
    	   digits[i] = 0;
       }
       
       int arrays[] = new int[digits.length + 1];
       arrays[0] = 1;
       return arrays;
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[] {1,2,3})));
		System.out.println(Arrays.toString(plusOne(new int[] {8,9,9,9})));
		System.out.println(Arrays.toString(plusOne(new int[] {19})));
	}
}
