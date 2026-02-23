class MaxFreqElement {
    public int maxFrequencyElements(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(x));
        }
        
        int total = 0;
        
        for(int freq : map.values()){
            if(freq == maxFreq){
                total += freq;
            }
        }
        
        return total;
    }
}