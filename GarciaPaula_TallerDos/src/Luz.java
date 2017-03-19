import processing.core.PApplet;
import processing.core.PImage;

public class Luz extends Elemento {
	private float _nx, _ny;
	private PImage[] luz = new PImage[9];
	private int l;

	public Luz(PApplet app, float x, float y) {
		super(app, x, y);
		for (int i = 0; i < luz.length; i++) {
			luz[i] = app.loadImage("../data/l" + i + ".png");
		}

		l = (int) app.random(0, 9);
	}

	@Override
	public void pintar(float _x) {
		app.fill(137, 232, 203);
		app.image(luz[l], x, y);
		// app.ellipse(x+_x,y,20,20);
	}

	@Override
	public void pintar(float nx, float ny, float radio, float angulo, int c) {
		c = l;
		app.fill(137, 232, 203);
		_nx = nx + PApplet.cos(angulo) * radio;
		_ny = nx + PApplet.sin(angulo) * radio;
		app.image(luz[l], _nx, _ny);
		// app.ellipse(_nx,_ny,20,20);
	}

}
