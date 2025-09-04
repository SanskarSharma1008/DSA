class Solution {
public:
    int majorityElement(vector<int>& nums) {
        
        unordered_map<int,int>mp;

        for(int i=0;i<nums.size();i++){
            mp[nums[i]]++;

        }

        int ans=-1;
        int t=nums.size()/2+1;


        for(auto it:mp){
            int f=it.first;
            int c=it.second;

            if(c>=t){
                ans=f;
            }
        }


        return ans;



    }
};