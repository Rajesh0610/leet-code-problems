class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res=new StringBuilder();
        for(String w:words)
        {
            int sum=0;
            for(char c:w.toCharArray())
            {
                sum+=weights[c-'a'];
            }
            sum=sum%26;
            res.append((char)('z'-sum));
        }
        return res.toString();
    }
}