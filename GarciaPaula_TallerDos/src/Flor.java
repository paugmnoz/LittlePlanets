import processing.core.PApplet;
import processing.core.PImage;

public class Flor extends Elemento {
	
	private float _nx, _ny;
	private int rose;
	private PImage [] flor = new PImage [9];

	public Flor(PApplet app, float x, float y) {
		super(app, x, y);
		for (int i = 0; i < flor.length; i++) {
			flor[i] = app.loadImage("../data/Rosa"+i+".png");
		}
		
		rose = (int) app.random(0,9);
	}

	@Override
	public void pintar(float _x) {
		app.fill(232,125,202);
		app.image(flor[rose], x, y);
		//app.ellipse(x,y,20,20);	
	}
	
	public void pintar(float nx, float ny, float radio, float angulo, int c) {
		c = rose;
		app.stroke(255);
		app.fill(232,125,202);
		_nx = nx + PApplet.cos(angulo) * radio;
		_ny = nx + PApplet.sin(angulo) * radio;
		app.image(flor[rose], _nx, _ny);
		//app.ellipse(_nx,_ny,20,20);
	}
	
	public int getRose() {
		return rose;
	}

}
