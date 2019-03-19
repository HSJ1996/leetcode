//题目要求的时间复杂度是log（m+n),自然想到二分查找法，它的时间复杂度为logn,底数为2
//这个题目的难点在于对于两个未合并的数组要应用二分法
//INT_MAX INT_MIN long long
/*
class Solution {
public:
    int reverse(int x) {
        if(x<pow(-2,31) || x>pow(2,31))
            return 0;
        long long result=0;
        int a=x;
        int b=x;
        int weishu=0;
        while(a){
            weishu++;
            a/=10;
        }
        while(b){
            int temp=b%10;
            result+=temp*pow(10,weishu-1);
            weishu--;
            b=b/10;
        }
        if(abs(result)>INT_MAX)
            return 0;
        return result;
       
    }
};
*/
//官方解答
class Solution{
    public:
    int reverse(int x){
        int res=0;
        while(x!=0){
            if(abs(res)>INT_MAX/10) return 0;
            res=res*10+x%10;
            x/=10;
        }
        return res;
    }
};

