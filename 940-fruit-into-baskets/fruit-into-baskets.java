class Solution {
    public int totalFruit(int[] fruits) {
        int le=0;
        int max=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<fruits.length;i++)
        {
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while(map.size()>2)
            {
                map.put(fruits[le],map.get(fruits[le])-1);   
                if(map.get(fruits[le])==0)
                {
                    map.remove(fruits[le]);
                }
                le++;
            }
            max=Math.max(max,i-le+1);
        }
        return max;
    }
}