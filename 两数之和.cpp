
class Solution
{
public:
	std::vector<int> twoSum(std::vector<int> &v,int target);
};
std::vector<int> Solution::twoSum(std::vector<int> &v,int target){
	std::vector<int> answer;
	map<int,int> a;
	for(int i=0;i<v.size();i++)
		a[target-v[i]]=i;
	for(int i=0;i<v.size();i++)
		if(a.count(v[i]) && a[v[i]]!=i){
			answer.push_back(a[v[i]]);
			answer.push_back(i);
			return answer;
		}
}