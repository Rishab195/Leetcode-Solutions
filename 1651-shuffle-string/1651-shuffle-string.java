class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] restored = new char[n];
        for (int i = 0; i < n; i++) {
            restored[indices[i]] = s.charAt(i);
        }
        return new String(restored);
    }
}
