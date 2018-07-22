//给定一个字符串，求最长无重复子串
//分清子串和子序列
//ASCII码一共有256位
//整体思路：
//如果我们人工去找最长不重复子串，需要一个向右滑动的窗口。
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int m[256]={0};
        int left=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            if(m[s[i]]==0 || m[s[i]]<left){
                res=max(res,i-left+1);
            }
            else{
                left=m[s[i]];
            }
            m[s[i]]=i+1;
            
        }
        return res;
    }
};