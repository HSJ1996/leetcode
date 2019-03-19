//判断一个整数是否是回文数
//进阶：不将整数作为字符串来解决这个问题

// class Solution{
// 	public boolean isPalindrome(int x){
//         if(x < 0 || (x % 10 == 0 && x != 0))
//         	return false;
//         int x1 = 0;
//         while(x > x1){
//         	x1 = x1 * 10 + x % 10;
//         	x /= 10;
//         }
//         return x == x1 || x == x1 / 10;
// 	}
// }

//利用字符串的方法求解
class Solution{
	public boolean isPalindrome(int x){
		String xx = Integer.toString(x);
		String xx1 = new StringBuilder(xx).reverse().toString();
		if(xx.equals(xx1))
			return true;
		return false;
	}
}