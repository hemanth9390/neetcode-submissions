class Solution {
    public int longestConsecutive(int[] nums) {
        int startnum;int count=1;int finalcount=0;
        HashSet set = new HashSet<>(); 
        for (int n :nums){
            set.add(n);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                startnum=nums[i];
                while(set.contains(startnum+1)){
                    count++;
                    startnum=startnum+1;
                }
                finalcount=Math.max(count,finalcount);
                count=1;
            }
        }
        return finalcount;


    }
}
