class Solution {
    public int[] replaceElements(int[] arr) {
        int greatest = -1;
        int temp = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            temp = arr[i];
            arr[i] = greatest;
            if (temp > greatest) {
                greatest = temp;
            }
        }

        return arr;
    }
}