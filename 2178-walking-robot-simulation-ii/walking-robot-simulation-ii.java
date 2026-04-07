class Robot {
    String dirn[] = {"East", "North", "West", "South"};
    
    int x, y;
    int dir;
    int width, height;

    public Robot(int width, int height) {
        this.width = width;
        this.height = height;
        x = 0;
        y = 0;
        dir = 0;
    }
    
    public void step(int num) {
        int cycle = 2 * (width + height - 2);
         if (num % cycle == 0 && num > 0) {
            num = cycle;
        } else {
            num %= cycle;
        }

        while (num-- > 0) {
            if (dir == 0) { // East
                if (x + 1 < width) x++;
                else { dir = 1; y++; }
            } 
            else if (dir == 1) { // North
                if (y + 1 < height) y++;
                else { dir = 2; x--; }
            } 
            else if (dir == 2) { // West
                if (x - 1 >= 0) x--;
                else { dir = 3; y--; }
            } 
            else { // South
                if (y - 1 >= 0) y--;
                else { dir = 0; x++; }
            }
        }
    }
    
    public int[] getPos() {
        return new int[]{x, y};
    }
    
    public String getDir() {
        return dirn[dir];
    }
}