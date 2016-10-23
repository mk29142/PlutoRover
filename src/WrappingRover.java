package src;

public class WrappingRover implements Rover {

	private Surface surface;
	private Direction dir;
	private int x;
	private int y;

	public WrappingRover(int x, int y, Direction dir, Surface surface) {
		this.surface = surface;
		this.dir = dir;
		this.x = x;
		this.y = y;
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

	@Override
	public void move() {
		int xNew = x + dir.getdX();
		int yNew = y + dir.getdY();
		if (!surface.contains(xNew, yNew)) {
			moveEdgeCase(xNew, yNew);
		} else {
			x = xNew;
			y = yNew;
			markSurface();
		}
	}

	private void moveEdgeCase(int xNew, int yNew) {
		if (yNew < 0) {
			x = xNew;
			y = surface.getHeight() - 1;
			markSurface();
		}
		if (yNew >= surface.getHeight()) {
			x = xNew;
			y = 0;
			markSurface();
		}
		if (xNew < 0) {
			x = surface.getWidth() - 1;
			y = yNew;
			markSurface();
		}
		if (xNew >= surface.getWidth()) {
			x = 0;
			y = yNew;
			markSurface();
		}
	}

	@Override
	public void rotate(Rotation r) {
		dir = dir.rotate(r);
	}

}
