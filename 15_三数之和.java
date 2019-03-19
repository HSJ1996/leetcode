/*
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int length = nums.length;
        int i, j, k;
        if(length < 3)
            return result;
        for(i = 0; i < length - 2; ++i)
            for(j = i+1; j < length - 1; ++j)
                for(k = j+1; k < length; ++k){
                    if(nums[i] + nums[j] + nums[k] == 0) //加减乘除的优先级高于大小比较符号的优先级
                    {
                        int max = Math.max(nums[i],Math.max(nums[j],nums[k]));
                        int min = Math.min(nums[i],Math.min(nums[j],nums[k]));
                        int mid;
                        if((nums[i] >= nums[j] && nums[i] <= nums[k]) || (nums[i] >= nums[k] && nums[i] <= nums[j]))
                            mid = nums[i];
                        else if((nums[i] >= nums[j] && nums[j] >= nums[k])|| (nums[k] >= nums[j] && nums[j] >= nums[i]))
                            mid = nums[j];
                        else
                            mid = nums[k];
                        List<Integer> elem = Arrays.asList(min,mid,max);
                        result.add(elem);
                    }
                }
        //循环删除list应该从后往前写
        for(i = 0; i < result.size() - 1; ++i)
            for(j = result.size() - 1; j > i; --j){
                List a = result.get(i);
                List b = result.get(j);
                if(a.get(0) == b.get(0) && a.get(1) == b.get(1) && a.get(2) == b.get(2))
                    result.remove(j);
            }
        return result;
    }
}
*/
//最后来了个巨大的测试用例，三重循环肯定 out of run time …… 真TM菜
//看看别人的方法， 真TM牛批
class Solution{
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; ++i){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int l = i + 1;
                int r = nums.length - 1;
                int sum = 0 - nums[i];
                while(l < r){
                    if(nums[l] + nums[r] == sum){
                        result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                        while(l < r && nums[l+1] == nums[l]) ++l;
                        while(l < r && nums[r-1] == nums[r]) --r;
                        ++l; --r;
                    }
                    else if(nums[l] + nums[r] < sum){
                        while(l < r && nums[l+1] == nums[l]) ++l;
                        ++l;
                    }
                    else{
                        while(l < r && nums[r-1] == nums[r]) --r;
                        --r;
                    }
                }
            }
        }
        return result;
    }
}