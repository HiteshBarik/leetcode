class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int start_pointer = 0;
        int end_pointer = height.length - 1;

        while(start_pointer < end_pointer) {
            if(height[start_pointer] < height[end_pointer]) {
                max_area = Math.max(max_area, height[start_pointer] * (end_pointer - start_pointer));
                start_pointer++;
            } else {
                max_area = Math.max(max_area, height[end_pointer] * (end_pointer - start_pointer));
                end_pointer--;
            }
        }

        return max_area;
        
    }
}