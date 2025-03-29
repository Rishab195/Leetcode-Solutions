class Solution {
    public int titleToNumber(String columnTitle) {
        columnTitle.toCharArray();
        int n=columnTitle.length();
        long count=0;
        for(int i=0;i<n;i++){
            count =count*26+columnTitle.charAt(i)-'A'+1;
        }
        return (int)count;
    }
}