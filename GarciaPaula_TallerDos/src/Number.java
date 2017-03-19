import processing.core.PApplet;
import processing.core.PImage;

public class Number extends Elemento {
	private float _nx, _ny;
	private PImage [] number = new PImage [9];
	private int num;


	public Number (PApplet app, float x, float y) {
		super(app, x, y);
		for (int i = 0; i < number.length; i++) {
			number [i] = app.loadImage("../data/n"+i+".png");
		}
		
		num = (int) app.random(0,9);	}


	@Override
	public void pintar(float _x) {
		app.fill(247,237,240);
		app.image(number[num], x, y);
//	app.ellipse(x+_x,y,20,20);
	}


	@Override
	public void pintar(float nx, float ny, float radio, float angulo, int c) {
		c=num;
		app.fill(247,237,240);
		_nx = nx + PApplet.cos(angulo) * radio;
		_ny = nx + PApplet.sin(angulo) * radio;
		app.image(number[num], _nx, _ny);
 //	app.ellipse(_nx,_ny,20,20);
		}

}
