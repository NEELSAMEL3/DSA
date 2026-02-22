class Jwels_Stone {
    public int numJewelsInStones(String jewels, String stones) {
        
        boolean[] isJewel = new boolean[128];
        
        // mark jewels
        for(int i = 0; i < jewels.length(); i++){
            isJewel[jewels.charAt(i)] = true;
        }
        
        int count = 0;
        
        // check stones
        for(int i = 0; i < stones.length(); i++){
            if(isJewel[stones.charAt(i)]){
                count++;
            }
        }
        
        return count;
    }
}