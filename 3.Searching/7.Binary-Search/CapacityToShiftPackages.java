class CapacityToShiftPackages {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0, right = 0;

        // The minimum capacity must be at least the max weight,
        // maximum capacity is sum of all weights
        for (int w : weights) {
            left = Math.max(left, w);
            right += w;
        }

        while (left < right) {
            int mid = left + (right - left) / 2; // candidate capacity
            if (canShip(weights, days, mid)) {
                right = mid; // try smaller capacity
            } else {
                left = mid + 1; // need larger capacity
            }
        }

        return left; // minimum capacity to ship in 'days'
    }

    // Helper to check if we can ship all packages in given days with capacity cap
    private boolean canShip(int[] weights, int days, int cap) {
        int usedDays = 1, currentLoad = 0;
        for (int w : weights) {
            if (currentLoad + w > cap) {
                usedDays++;
                currentLoad = 0;
            }
            currentLoad += w;
        }
        return usedDays <= days;
    }
}