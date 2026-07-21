class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] s = arr.clone();
        Arrays.sort(s);
        int m = 0;
        for (int x : s) {
            if (m == 0 || s[m - 1] != x) {
                s[m++] = x;
            }
        }
        int[] u = Arrays.copyOf(s, m);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Arrays.binarySearch(u, arr[i]) + 1;
        }
        return arr;
    }
}