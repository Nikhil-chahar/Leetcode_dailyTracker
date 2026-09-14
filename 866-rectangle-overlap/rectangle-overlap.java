class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int mnX1 = Math.min(rec1[0],rec1[2]);
        int mxX1 = Math.max(rec1[2],rec1[0]);

        int mnY1 = Math.min(rec1[1],rec1[3]);
        int mxY1 = Math.max(rec1[1],rec1[3]);

        int mnX2 = Math.min(rec2[0],rec2[2]);
        int mxX2 = Math.max(rec2[0],rec2[2]);

        int mnY2 = Math.min(rec2[1],rec2[3]);
        int mxY2 = Math.max(rec2[1],rec2[3]);

        if(mnX1 < mxX2 && mnX2 < mxX1 && mnY1 < mxY2 && mnY2 < mxY1){
            return true;
        }
        return false;
    }
}