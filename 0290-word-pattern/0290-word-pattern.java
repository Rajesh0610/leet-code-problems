class Solution {
    public boolean wordPattern(String pattern, String s) {
        String d[]=s.split(" ");
        if(pattern.length() != d.length)
        return false;
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Character> map1=new HashMap<>();
        for(int i=0;i<pattern.length();i++)
        {
            char c=pattern.charAt(i);
            if(map.containsKey(c))
            {
                 if(!map.get(c).equals(d[i]))
                {
                    return false;
                }
            }
            else
            {
               map.put(c,d[i]);
            }
            if(map1.containsKey(d[i]))
            {
                if(map1.get(d[i])!=c)
                {
                    return false;
                }
            }
            else
            {
                map1.put(d[i],c);
            }
        }
        return true;
    }
}