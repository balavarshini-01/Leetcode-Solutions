class Solution {
    public int trap(int[] height) {
        int max1=0;
        int arr1[]=new int[height.length];
        int arr2[]=new int[height.length];
        int arr3[]=new int[height.length];
        for(int i=0;i<arr1.length;i++){
            max1=Math.max(max1,height[i]);
            arr1[i]=max1;
        }
        
        int max2=0;
        for(int j=height.length-1;j>=0;j--){
            max2=Math.max(max2,height[j]);
            arr2[j]=max2;
            
        }
        int min=0;
        for(int i=0;i<arr1.length;i++){
            min=Math.min(arr1[i],arr2[i]);
            arr3[i]=min-height[i];
        }
        int sum=0;
        for(int i=0;i<arr3.length;i++){
            sum+=arr3[i];
        }
return sum;
         
    }
}