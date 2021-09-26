class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arrAns = new int[2];
        for(int i=0;i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                int missingNum = target - nums[i];
                if (missingNum == nums[j]) {
                    arrAns[0] = i;
                    arrAns[1] = j;
                }

            }
            i++;
        }
        return arrAns;
    }
}