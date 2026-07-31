class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];

        for(char ch : word.toCharArray()){
            arr[ch - 'a']++;
        }

        int min = 0;

        Arrays.sort(arr);

        for(int i = 25, j = 0; i >= 0; i--){
            int Idx = 25 - i;

            if(Idx % 8 == 0)
                j++;

            min += arr[i] * j;
        }

        return min;
    }
}