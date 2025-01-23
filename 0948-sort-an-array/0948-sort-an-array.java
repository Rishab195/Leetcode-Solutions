class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int[]nums,int s,int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        mergeSort(nums,s,mid);

        mergeSort(nums,mid+1,e);
        merge(nums,s,e);
    }
    public void merge(int[]nums,int s,int e){
        int mid=s+(e-s)/2;
        int len1=mid-s+1;
        int len2=e-mid;
        int[] arr1=new int[len1];
        int arr2[]=new int[len2];

        for(int i=0;i<len1;i++){
            arr1[i]=nums[s+i];
        }
        for(int i=0;i<len2;i++){
            arr2[i]=nums[mid+1+i];
        }
        int k=s;
        int index1=0;
        int index2=0;
        while(len1>index1 && len2>index2){
            if(arr1[index1]<arr2[index2]){
                nums[k++]=arr1[index1++];
            }
            else{
                nums[k++]=arr2[index2++];
            }
        }
        while(len1>index1){
            nums[k++]=arr1[index1++];
        }
        while(len2>index2){
            nums[k++]=arr2[index2++];
        }

    }
}