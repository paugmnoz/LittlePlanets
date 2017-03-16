import processing.core.PApplet;

public abstract class Elemento {

	protected float x, y;
	protected PApplet app;

	public Elemento(PApplet app, float x, float y) {
		this.app = app;
		this.x = x;
		this.y = y;
	}

	public abstract void pintar(float _x);
	
	public abstract void pintar(float nx, float ny);

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}
}
