class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
            for(int i=0;i<strs.size();i++){
                String S = strs.get(i);
                sb.append(S.length());
                sb.append("#");
                sb.append(S);
            }
            String result = sb.toString();
            return result;
    }

    public List<String> decode(String str) {
  int i=0; 
  List<String> list = new ArrayList<>();
while(i<str.length()){
  String count= "";
  while(str.charAt(i)!='#'){ /* 4#numb5#okok    */
     count = count +  str.charAt(i);
    i++;
  }
   int number = Integer.parseInt(count);
   list.add(str.substring(i+1,number+i+1));
 i = i+ number +1;
    }   return list;   }
  
}
