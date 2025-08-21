class Solution {
    public int trap(int[] height) {
      return trapping(height);  
    }
    public static int trapping(int [] arr){
        int n =arr.length;
        int sum=0;
        int [] left = new int [n];
        left[0]= arr[0];
        for (int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        int [] right = new int [n]; 
        right[n-1]=arr[n-1];
        for (int j=n-2;j>=0;j--){
            right[j]=Math.max(right[j+1],arr[j]);
        }
        for (int k=0;k<n;k++){
            sum += Math.min(left[k],right[k])-arr[k];
        }
        return sum;
    }
}