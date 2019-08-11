/**
 * 
 */
package leetcode.dp;

/**
 * @author lenovo
  *  创建时间 2019年8月11日上午10:47:10
 *  
 */
public class Number198 {
	//自顶向下 递归版
//	 int[] result;
//	    public int solve(int index, int[] nums){
//	        if(index < 0){
//	            return 0;
//	        
//	        }
//	        if(result[index] >= 0){
//	            return result[index];
//	        }
//	        result[index] = Math.max(nums[index] + solve(index - 2, nums),solve(index - 1, nums));
//	        return result[index];
//	    }
//	    public int rob(int[] nums) {
//	        result = new int[nums.length];
//	        for(int i =0, length = nums.length; i < length; i++){
//	            result[i] = -1;
//	        }
//	        return solve(nums.length - 1, nums);
//	    }
	public int rob(int[] nums) {
		
		int length = nums.length;
		if(nums == null || length == 0) {
			return 0;
		}
		if(length == 1) {
			return nums[0];
		}
		
		int[] result = new int[nums.length];
		result[0] = nums[0];
		result[1] = Math.max(nums[0], nums[1]);
		
		
		for(int i = 2,temp; i < length; i++) {
			result[i] = Math.max(nums[i] + result[i - 2], result[i - 1]);
		}
		return result[result.length - 1];
	}
}
