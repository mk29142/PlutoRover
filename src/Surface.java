package src;

public class Surface {

    private int width;
    private int height;
    private char[][] grid;

    public Surface(int width, int height) {
        this.width = width;
        this.height = height;
        buildGrid(width, height);
    }

    private void buildGrid(int width, int height) {
        grid = new char[height][width];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                grid[j][i] = ' ';
            }
        }
    }
    
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean contains(int x, int y) {
        return x >= 0 && y >= 0 && x < width && y < height;
    }
    
    public void mark(int x, int y) {
        if (!contains(x, y))
            return;
        else
            grid[height - y - 1][x] = '*';
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                sb.append(grid[j][i]);
            }
            sb.append("\n");
        }
        sb.append("\n");
        return sb.toString();
    }
}