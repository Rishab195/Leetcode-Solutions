class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            s=rle(s);
        }
        return s;
    }
    public String rle(String s){
        StringBuilder str=new StringBuilder();

        int count=1;
        char ch=s.charAt(0);
        int i=1, n=s.length();

        while(i<n){
            if(s.charAt(i)==ch){
                count++;
            }
            else{
                str.append(count).append(ch);
                count=1;
                ch=s.charAt(i);
            }
            i++;
        }
        str.append(count).append(ch);
        return str.toString();
    }
}