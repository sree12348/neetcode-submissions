class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
        {
            return false;
        }
      HashMap<Character,Integer> hm1=new HashMap<>();
      //HashMap<Character,Integer> hm2=new HashMap<>();
      for(char c:s.toCharArray())
      {
         hm1.put(c,hm1.getOrDefault(c,0)+1);
         
      }
      for(char d:t.toCharArray())
      {
         hm1.put(d,hm1.getOrDefault(d,0)-1);
      }
      for (int val : hm1.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}
