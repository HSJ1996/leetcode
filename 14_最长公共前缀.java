
//编写一个函数来查找字符串数组中的最长公共前缀。
//如果不存在公共前缀，返回空字符串 ""。

// 可以通过length直接获取数组的长度
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int i,j;
        int flag = 1;
        if(strs.length == 0)
            return result;
        if(strs.length == 1)
            return strs[0];
        int min = Integer.MAX_VALUE;
        for(int k = 0; k < strs.length;++k)
            if (strs[k].length() < min)
                min = k;
        for(j = 0 ; j < (int)strs[min].length() ; ++j){
        for(i = 0; i < (int)strs.length - 1; ++i)
        	if(strs[i].charAt(j) != strs[i+1].charAt(j)){
        		flag = 0;
        		break;
        	}
       if(flag == 0)
        break;

        }

       result = result + strs[0].substring(0,j);
       return result;
    
    }
}