import processing.core.PApplet;
import processing.core.PImage;

public class Bottle extends Elemento {
	private float _nx, _ny;
	private int b;
	private PImage[] bottle = new PImage[9];

	public Bottle (PApplet app, float x, float y) {
		super(app, x, y);
		for (int i = 0; i < bottle.length; i++) {
			bottle[i] = app.loadImage("../data/b" + i + ".png");
		}

		c = (int) app.random(0, 9);	}

	@Override
	public void pintar(float _x) {
		app.fill(232,145,98);
		app.image(bottle[c], x, y);
//		app.ellipse(x+_x,y,20,20);
	}

	@Override
	public void pintar(float nx, float ny, float radio, float angulo, int t) {
		app.fill(232,145,98);
		_nx = nx + PApplet.cos(angulo) * radio;
		_ny = nx + PApplet.sin(angulo) * radio;
		app.image(bottle[c], _nx, _ny);
//		app.ellipse(_nx,_ny,20,20);	
		}


}
