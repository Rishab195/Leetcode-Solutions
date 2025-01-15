class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int n1=t.length();
        if(n!=n1){
            return false;
        }
        int arr[]=new int[n];
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.charAt(i)-'a';
        }
        for(int i=0;i<n1;i++){
            arr1[i]=t.charAt(i)-'a';
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        return Arrays.equals(arr,arr1);
    }
}