class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long cu = mass;

        for(int v : asteroids){
            if(cu < v){
                return false;
            }
            cu += v;
        }
        return true;
    }
}