class Leetcode1800 {
    public static int maxAscendingSum(int[] nums){
        int n = nums.length;
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i = 1; i<n; i++){
            if(nums[i]>nums[i-1]){
                sum += nums[i];

            }
            else{
                maxSum = Math.max(maxSum, sum);
                sum = nums[i];
            }
        }
        maxSum = Math.max(maxSum, sum);
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {10,20,30,5,10,50};
        System.out.println(maxAscendingSum(nums));
    }
}