class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Will contain the current unique substring
        List<Character> substring = new ArrayList<>();
        int largestLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (substring.contains(s.charAt(i))) {
                // Gets the index of current character in string
                int index = substring.indexOf(s.charAt(i));
                substring.remove(index);
                if (index > 0) {
                    substring.subList(0, index).clear();
                }
            }
            System.out.println(substring);
            substring.add(s.charAt(i));
            largestLength = Math.max(largestLength, substring.size());
        }
        return largestLength;
    }
}
