class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int start_pointer = 0;
        int end_pointer = height.length - 1;

        while(start_pointer < end_pointer) {
            int startHeight = height[start_pointer];
            int endHeight = height[end_pointer];
            if(startHeight < endHeight) {
                max_area = Math.max(max_area, startHeight * (end_pointer - start_pointer));
                start_pointer++;
            } else {
                max_area = Math.max(max_area, endHeight * (end_pointer - start_pointer));
                end_pointer--;
            }
        }

        return max_area;
        
    }
}