class MySqrt {
    public int mySqrt(int x) {
        if (x < 2) return x; // handle 0 and 1

        int left = 1, right = x / 2;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) { // avoid overflow by using division
                ans = mid;       // mid is a candidate
                left = mid + 1;  // try larger
            } else {
                right = mid - 1; // mid^2 > x, try smaller
            }
        }

        return ans;
    }
}