class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
                    ArrayList<String> list=new ArrayList<>();

            String str= sortstring(strs[i]);
            if(hm.containsKey(str)){
                hm.get(str).add(strs[i]);
            }
            else{
                list.add(strs[i]);
                hm.put(str,list);
            }
        }
        return new ArrayList<>(hm.values());
    }
    public String sortstring(String str){
        char[] charr = str.toCharArray();
        Arrays.sort(charr);
        String strs= new String(charr);
        return strs;
    }


}
