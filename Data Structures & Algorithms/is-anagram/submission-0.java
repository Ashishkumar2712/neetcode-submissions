class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n!=m) return false ;
        int[] arr = new int[26];

        for (char ch: s.toCharArray()){
            arr[ch -97]++;
        }
        for (char ch: t.toCharArray()){
            arr[ch-97] --;

        
        if (arr[ch-97] < 0) {
            return false ;
        }
        }
        return true;
    }
}
