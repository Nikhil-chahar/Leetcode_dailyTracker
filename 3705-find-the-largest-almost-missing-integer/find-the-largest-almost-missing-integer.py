class Solution:
    def largestInteger(self, nums: List[int], k: int) -> int:
        freq =[0]*51

        n = len(nums)
        
        for i in range(n-k+1):
            j = i
            while j < i+k:
                freq[nums[j]]+=1
                print(nums[j],end=" ")
                j+=1
            print("\n")

        mx = -1

        for i in range(n):
            if freq[nums[i]] == 1 or k == n :
                mx = max(nums[i],mx)

        return mx

        