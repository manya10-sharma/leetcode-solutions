class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int i=0 ; i<nums.length ; i++){
           actualSum += nums[i];
         }
            return (expectedSum - actualSum);
        } 
        public static void main(String args[]){
          Solution s = new Solution();
          int arr[] = {1,3,5,4,0};
          System.out.print(s.missingNumber(arr));
        }
    }
