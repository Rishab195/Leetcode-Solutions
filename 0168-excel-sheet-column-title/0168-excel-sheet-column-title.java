class Solution {
    public String convertToTitle(int n) {
        StringBuilder res=new StringBuilder();
        while(n>0){
            n--;
            int rem=n%26;
            res.append((char)(rem+'A'));
            n/=26;
        }

        return res.reverse().toString();
    }
}