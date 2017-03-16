import processing.core.PApplet;

public class Bottle extends Elemento {


	public Bottle (PApplet app, float x, float y) {
		super(app, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar(float _x) {
		app.fill(232,145,98);
		app.ellipse(x+_x,y,20,20);
	}

	@Override
	public void pintar(float nx, float ny) {
		// TODO Auto-generated method stub
		
	}


}
