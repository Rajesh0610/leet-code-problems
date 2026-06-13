class Solution {
    public int lengthOfLongestSubstring(String s)
     {
        HashSet<Character> st=new HashSet<>();
        int ind=0, max=0;
        for(int i=0;i<s.length();i++)
        {
            while(st.contains(s.charAt(i)))
            {
                st.remove(s.charAt(ind));
                ind++;
            }
            st.add(s.charAt(i));
            max=Math.max(max,i-ind+1);
        }
        return max;
    }
}
    
