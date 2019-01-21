class Solution{
	public int[] twoSum(int[] nums,int target){
		int[] resluts = new int[2];
		Map<Integer,Integer> temp = new HashMap();
		for(int i = 0; i < nums.length; ++i)
			temp.put(target-nums[i],i);
		for(int i = 0; i < nums.length; ++i)
			if(temp.containsKey(nums[i]) && temp.get(nums[i]) != i){
				resluts[0] = i;
				resluts[1] = temp.get(nums[i]);
			}
		return resluts;
	}
}