import processing.core.PApplet;
import processing.core.PImage;

public class Star extends Elemento {
	private float _nx, _ny;
	private int s;
	private PImage[] star = new PImage[9];

	public Star(PApplet app, float x, float y) {
		super(app, x, y);
		for (int i = 0; i < star.length; i++) {
			star[i] = app.loadImage("../data/Star" + i + ".png");
		}

		c = (int) app.random(0, 9);
	}

	@Override
	public void pintar(float _x) {
		app.fill(98, 205, 232);
		app.image(star[c], x, y);
		// app.ellipse(x+_x,y,20,20);
	}

	@Override
	public void pintar(float nx, float ny, float radio, float angulo, int t) {
	
		app.fill(98,205,232);
		_nx = nx + PApplet.cos(angulo) * radio;
		_ny = nx + PApplet.sin(angulo) * radio;
		app.image(star[c], _nx, _ny);
		//app.ellipse(_nx,_ny,20,20);		
		}
}
