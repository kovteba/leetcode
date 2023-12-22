class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int index = 0;

        String string1 = strs[0];
        String string2 = strs[strs.length - 1];
        while (index < string1.length() && index < string2.length()) {
            if (string1.charAt(index) == string2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        return string1.substring(0, index);
    }
}