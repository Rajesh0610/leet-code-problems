class Solution {
    public int maxArea(int[] h) {
        int i=0;
        int j=h.length-1;
        int max=0;
        while(i<j)
        {
            max=Math.max(max,(j-i)*Math.min(h[i],h[j]));
            if(h[i]<h[j]) i++;
            else j--;
        }
        return max;
        
    }
}