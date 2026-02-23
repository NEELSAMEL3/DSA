public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int firstBad = n; // initialize to maximum possible version

        while (left <= right) {
            int mid = left + (right - left) / 2; // prevent overflow
            if (isBadVersion(mid)) {
                firstBad = mid;    // potential first bad version
                right = mid - 1;   // look for earlier bad versions
            } else {
                left = mid + 1;    // move right if version is good
            }
        }

        return firstBad;
    }
}