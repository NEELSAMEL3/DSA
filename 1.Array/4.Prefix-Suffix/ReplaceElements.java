class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxRight = -1; // last element will be -1

        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];  // store current value
            arr[i] = maxRight;     // replace with max to the right
            if (current > maxRight) {
                maxRight = current; // update maxRight
            }
        }

        return arr;
    }
}