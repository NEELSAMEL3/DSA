class FindDisappearedNumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for(int x : nums){
            set.add(x);
        }
        
        for(int i = 1; i <= nums.length; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        
        return result;
    }
}