class Solution {
    public int maxScore(String s) {
        int totalOnes = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                totalOnes++;
        }

        int score =0;
        int prefixZero =0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0')
            prefixZero++;

            score=Math.max(score,(prefixZero+totalOnes-(i-prefixZero+1)));
        }
        return score;
    }
}