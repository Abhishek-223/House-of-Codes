class Solution {
    public int numberOfGoodPartitions(int[] nums) {
        HashMap<Integer,Integer>last_ind = new HashMap<>();
        int mod= 1000000007;
        for(int i=0;i<nums.length;i++){
            last_ind.put(nums[i],i);
        }
        int ans = 1;
        int i = 0;
        int j = 0;
        j = Math.max(j,last_ind.get(nums[i]));
        while(i<nums.length){
            if(i>j){
                ans=(ans*2)%mod;
            }
            j = Math.max(j,last_ind.get(nums[i]));
            i++;
        }
        return ans;
    }
}
