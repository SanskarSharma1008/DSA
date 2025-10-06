class Solution {
public:
    int largestPerimeter(vector<int>& nums) {
        int largest=0;
        sort(nums.begin(),nums.end());
        int n=nums.size()-1;
        int i=n,j=n,k=n;
        while(k>0)
        {
            j=i-1;
            k=j-1;
            if(nums[k]+nums[j]>nums[i])
            {
                return nums[i]+nums[j]+nums[k];
            }
            i--;
        }
        return 0;
    }
};