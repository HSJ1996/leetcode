class Solution{
	public int reverse(int x){
		int recv = 0;
		
		while(x != 0){
			int pop = x % 10;
			x = x / 10;
			int temp = recv;
			recv = recv * 10 + pop;
			if(recv / 10 != temp)
				return 0;
		}
		return recv;
	}
}