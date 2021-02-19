package unify;

public class LeetCodeTest {

	public static void main(String[] args) {
		
		int nums[] = {1,2,0,-1,3};
		int target = 6;
		
		int temp = 0;
		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					temp = temp+1;
					System.out.println(i + " " + j);
				}
			}
		}
		
		if (temp==0) {
			System.out.println("value not found");
		}
		
	}

}
