package Easy;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        int i, j, firstElement = 0, secondElement = 0, add =  0;
        for(i = 0; i < nums.length; i++) {
        	firstElement = nums[i];
        	for(j = i + 1; j < nums.length; j++) {
        		secondElement = nums[j];
        		
        		add = firstElement + secondElement;
        		
        		if(add == target) {
        			return new int[] {i,j};
        		}
        	}
        }
        return new int[0];	
    }
	
	public static void main(String[] args) {
		System.out.print("Hello");
	}
}
