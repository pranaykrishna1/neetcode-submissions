class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> traversedItems = new HashSet<>();

        for(int num: nums){
            if(traversedItems.contains(num)){
                return true;
            }
            traversedItems.add(num);
        }

        return false;

    }
}