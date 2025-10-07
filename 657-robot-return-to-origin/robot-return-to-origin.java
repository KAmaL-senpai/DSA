class Solution {
    public boolean judgeCircle(String moves) {
          int[] pos = { 0, 0 };
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U')
                pos[1]++;

            if (moves.charAt(i) == 'D')
                pos[1]--;

            if (moves.charAt(i) == 'L')
                pos[0]--;

            if (moves.charAt(i) == 'R')
                pos[0]++;
        }
        
        if (pos[0] ==0 && pos[1]==0)
            return true;

        return false;
    }
}