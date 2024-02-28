class Solution {
    public int removeDuplicates(int[] nums) {
        //Maintained to override exisiting values with unqiue ones
        int swap = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[swap] = nums[i];
                swap++;
            }
        }

        return swap;
    }
}