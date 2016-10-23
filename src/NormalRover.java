package src;

public class NormalRover implements Rover {

	private Surface surface;
	private Direction dir;
	private int x;
	private int y;

	public NormalRover(int x, int y, Direction dir, Surface surface) {
		this.surface = surface;
		this.dir = dir;
		this.x = x;
		this.y = y;
	}

	@Override
	public void rotate(Rotation r) {
		dir = dir.rotate(r);
	}

	@Override
	public void move() {
		int xNew = x + dir.getdX();
		int yNew = y + dir.getdY();
		if (!surface.contains(xNew, yNew)) {
			xNew = x;
			yNew = y;
		}
		x = xNew;
		y = yNew;
		markSurface();
	}
	
	@Override
	public int getX() {
		return x;
	}
	
	@Override
	public int getY() {
		return y;
	}
	
	@Override
	public void markSurface() {
		surface.mark(x, y);
	}

}
