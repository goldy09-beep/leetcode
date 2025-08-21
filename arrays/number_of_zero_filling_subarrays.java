class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n= nums.length;
        long ans=0 ,c=0;;
        int i =0;
        while(i < n){
            if (nums[i]==0){
                c++;
            } 
            else{
                c=0;
            }
            ans+=c;
            i++;
        }
        return ans;
    }
}
