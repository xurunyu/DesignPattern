public class FindDuplicateNumber {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = {1,3,4,2,2};
        int result = solution.findDuplicate(input);
        System.out.println(result);
    }

}

class Solution {
    public int findDuplicate(int[] nums) {
        int fast = 0, slow = 0;
        fast = nums[nums[fast]];
        slow = nums[slow];
        while(fast != slow) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        for (int i = 0; i != slow; i = nums[i]) {
            slow = nums[slow];
        }
        return slow;
    }
}