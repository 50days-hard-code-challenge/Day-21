class Solution {
public:
    int singleNumber(vector<int>& nums) {
        /*int i=0;
        int ans;
        sort(nums.begin(),nums.end());
        while(i<nums.size()){
            
            if((i<nums.size()-1) && nums[i]==nums[i+1])
            {
                i+=2;
            }
            else{
                ans=nums[i];
                break;
            }
        }
        return ans;*/

        int ans=0;
        for(int i=0;i<nums.size();i++){
            ans=ans^nums[i];
        }
        return ans;
        
    }
};
