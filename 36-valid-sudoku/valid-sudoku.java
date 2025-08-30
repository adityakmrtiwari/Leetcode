class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> cm = new HashSet<>();

         for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char x = board[i][j];

                if(x!='.'){

                String row = x + "row" + i;
                String col = x + "col" + j;
                String st = x + "st" + (i/3) + "" + (j/3);

                if(!cm.add(row) || !cm.add(col) || !cm.add(st))
                     return false;
            }
            }
         }


         return true;
    }
}