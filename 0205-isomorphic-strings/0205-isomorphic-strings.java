class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character>map=new HashMap<>();
        HashMap<Character,Character>map1=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char c=s.charAt(i);
            char d=t.charAt(i);
            if(map.containsKey(c))
            {
                if(!map.get(c).equals(d))
                {
                    return false;
                }
            }
            else
            {
                map.put(c,d);
            }
            if(map1.containsKey(d))
            {
                if(map1.get(d)!=c)
                {
                    return false;
                }
            }
            else
            {
                map1.put(d,c);
            }
        }
        return true;
    }
}