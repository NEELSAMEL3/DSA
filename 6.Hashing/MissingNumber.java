class MissingNumber {
    public int missingNumber(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int x : nums){
            set.add(x);
        }
        
        for(int i = 0; i <= nums.length; i++){
            if(!set.contains(i)){
                return i;
            }
        }
        
        return -1;
    }
}