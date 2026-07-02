class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;
        for (int pile:piles ){
            max = Math.max(max, pile);
        }
        int low =1; int high = max ;
        while (low <= high){
        int mid = (low+high)/2 ;
        int totalhr = 0;

        for (int pile: piles ){
            totalhr += (pile + mid - 1)/mid ;

        }
        if (totalhr <= h){
            high = mid-1;
        }
        else {
            low = mid+1 ;
        }
        }
        return low;


        
    }
}
