class EatingSpeed {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1; // minimum possible speed
        int right = 0; // maximum possible speed
        for (int p : piles) right = Math.max(right, p);

        while (left < right) {
            int mid = left + (right - left) / 2; // candidate speed
            if (canEatAll(piles, h, mid)) {
                right = mid; // try smaller speed
            } else {
                left = mid + 1; // need larger speed
            }
        }

        return left; // minimum feasible speed
    }

    // Helper: can Koko eat all bananas in h hours at speed k?
    private boolean canEatAll(int[] piles, int h, int k) {
        int hours = 0;
        for (int p : piles) {
            // ceil division: hours needed for this pile
            hours += (p + k - 1) / k;
        }
        return hours <= h;
    }
}