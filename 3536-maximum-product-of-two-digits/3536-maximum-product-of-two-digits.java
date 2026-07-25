class Solution {
    public int maxProduct(int n) {
        int rem=1;
        String s=String.valueOf(n);
        int ind=0;
        int arr[]=new int[s.length()];
        while(n>0)
        {
            int temp=n%10;
            arr[ind]=temp;
            ind++;
            n/=10;
        }
        Arrays.sort(arr);
        return arr[arr.length-2]*arr[arr.length-1];
    }
}