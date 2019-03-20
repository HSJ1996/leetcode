//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
class Solution {
    public int lengthOfLongestSubstring(String s) {
        //建立一个256位大小的数组来代替哈希表，应为ASCII能表示256个字符
        int[] table = new int[256];int left = 0, res = 0 ;
        for(int i = 0; i < s.length(); ++i){
        	char c = s.charAt(i);
        	if(table[c] == 0 || table[c] < left){
        		res  = Math.max(res,i - left + 1);
        	}
        	else
        		left = table[c];
        	table[c] = i + 1;
        	
        }
return res;

    }
}