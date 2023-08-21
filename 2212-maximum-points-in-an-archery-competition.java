class Solution {
    int bob = 0;
    int maxBob[] = new int[12];
    public int[] maximumBobPoints(int numArrows, int[] aliceArrows) {
        int bobArrows[] = new int[12];
        calc(aliceArrows, bobArrows, 11, numArrows, 0);
        return maxBob;
    }
    public void calc(int[] aliceArrows, int[] bobArrows, int index, int arrowsLeft, int point) {
        if (index < 0 || arrowsLeft <= 0) {
            if (arrowsLeft > 0) {
                bobArrows[0]  += arrowsLeft;
            }
            if (point > bob) {
                bob = point;
                maxBob = bobArrows.clone();
            }
            return;
        }
        if (arrowsLeft >=  aliceArrows[index]+1) {
            bobArrows[index] = aliceArrows[index]+1;
            calc(aliceArrows, bobArrows, index-1, arrowsLeft-(aliceArrows[index]+1), point+index);
            bobArrows[index] = 0;
        }
        calc(aliceArrows, bobArrows, index-1, arrowsLeft, point);
        bobArrows[index] = 0;
    }
}