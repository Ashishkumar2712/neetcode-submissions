class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int i =0;
        int j = n-1;

        while (i <=j){
            int m = (i+j)/2;
            if (nums[m] < target){
                i = m+1;
            }
            else if (nums[m] > target){
                j =m-1;
            }
            else  return m;
            }
            return i;
        }
    }
