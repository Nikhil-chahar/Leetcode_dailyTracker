class Solution {
public:
    int largestInteger(vector<int>& nums, int k) {
        int freq[51];

        int n = nums.size();

        for(int i=0;i<=n-k;i++){
            for(int j=i;j<i+k;j++){
                freq[nums[j]]++;
                cout<<nums[j] <<" ";
            }
            cout<<endl;
        }
        int mx =-1;

        for(int i=0;i<n;i++){
            if(freq[nums[i]] == 1 || k == n){
                mx = max(nums[i],mx);
            }
        }

        return mx;
    }
};