class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten =0;
        int twenty =0;

        for(int num : bills){
            if(num==5)
                five++;
            else if (num == 10 && five >0){
                ten++;
                five--;
            }
            else if( num == 20 && ten >0 && five >0){
                twenty++;
                ten--;
                five--;
            }
            else if (num==20 && five>2){
                twenty++;
                five=five-3;
            }
            else return false;
        }
        return true;
    }
}