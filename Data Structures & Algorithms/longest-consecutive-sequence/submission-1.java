class Solution {
    public int longestConsecutive(int[] nums) {
           int startnum;int count=1;int finalcount=0;
        HashSet<Integer> set = new HashSet<>(); 
        for (int n :nums){
            set.add(n);
        }
 for (int n : set) {
            if(!set.contains(n-1)){
                startnum=n;
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
