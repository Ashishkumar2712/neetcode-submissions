class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];


        for (int i =0; i<n; i++){
            nums[i] = nums[i]*nums[i];
        }
            int k =0;
            int l= n-1 ;
            for (int j= n-1; j>= 0; j--){
            if (nums[k] > nums[l]){
                res[j] = nums[k];
                k++;
            }
            else {
                res[j] = nums[l];
                l--;
            }
        }
        return res;
    }
    }
