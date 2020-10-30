package cn.jeasky.dynamic;

/**
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
 *
 * 示例:
 *
 * 输入: [10,9,2,5,3,7,101,18]
 * 输出: 4
 * 解释: 最长的上升子序列是 [2,3,7,101]，它的长度是 4。
 * 说明:
 *
 * 可能会有多种最长上升子序列的组合，你只需要输出对应的长度即可。
 * 你算法的时间复杂度应该为 O(n2) 。
 * 进阶: 你能将算法的时间复杂度降低到 O(n log n) 吗?
 *
 */
public class MaxUperSonString300 {

    /**
    * @Description: 动态规划的思想去解决这个问题，
    * @Param: [nums]
    * @return: int
    * @Date: 2020/10/12
    */
    public static int lengthOfLIS(int[] nums) {
        int max = 1;
        int[] dp = new int[nums.length];
        for(int i =0 ; i < nums.length ; i++){
            dp[i] = 1;
            for(int j = 0; j<nums.length; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max = Math.max(dp[i], max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
}
