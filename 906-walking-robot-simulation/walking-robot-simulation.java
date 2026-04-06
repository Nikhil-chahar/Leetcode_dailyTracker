class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<String> set = new HashSet<>();

        for(int obs[] : obstacles){
            String s = obs[0]  + "_" + obs[1];
            set.add(s);
        }

        int x=0,y=0,mx=0;
        int dir[] = {0,1};

        for(int com : commands){
            if(com == -2){
                dir = new int[]{-dir[1],dir[0]};
            }else if(com == -1){
                dir = new int[]{dir[1],-dir[0]};
            }else{

                for(int i=0;i<com;i++){
                    int newx = x + dir[0];
                    int newy = y + dir[1];

                    String s = newx +"_" + newy;

                    if(set.contains(s)){
                        break;
                    }
                    x = newx;
                    y = newy;
                }
            }
            mx = Math.max(mx,x*x + y*y);
        }
        return mx;
    }
}