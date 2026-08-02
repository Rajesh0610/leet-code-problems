class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        List<Integer>li=new ArrayList<>();
        if(n<m) return li;
        int ar[]=new int[26];
        int a[]=new int[26];
        for(int i=0;i<m;i++)
        {
            ar[p.charAt(i)-'a']++;
            a[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(ar,a))
        {
            li.add(0);
        }
        for(int i=m;i<n;i++)
        {
            a[s.charAt(i)-'a']++;
            a[s.charAt(i-m)-'a']--;
            if(Arrays.equals(ar,a))  li.add(i-m+1);
        }
        return li;
    }
}