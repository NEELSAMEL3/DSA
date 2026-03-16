public class NumJewelsInStones {

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for (int i = 0; i < stones.length(); i++) {
            char stone = stones.charAt(i);

            // traverse jewels to check
            for (int j = 0; j < jewels.length(); j++) {
                if (stone == jewels.charAt(j)) {
                    count++;
                    break; // found, no need to check rest
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        String jewels = "aA";
        String stones = "aAAbbbb";

        int result = obj.numJewelsInStones(jewels, stones);

        System.out.println(result);
    }
}