class Solution {
    public double angleClock(int hr, int mn) {
        double ma = mn*6;
        double ha = ((hr%12)*30 +  (double)(mn*5*6)/60 );

        System.out.println(ma-ha);
        double min = Double.MAX_VALUE;

        if( ha > ma) min = Math.min(ha-ma,min);
        else min = Math.min(ma-ha,min);

        if(ha + (360-ma) < min) min = ha + (360-ma);
        if((360-ha) + ma < min) min = (360-ha) + ma;

        return min;

    }
}   
