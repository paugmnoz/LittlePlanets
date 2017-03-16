import processing.core.PApplet;

public class Number extends Elemento {


	public Number (PApplet app, float x, float y) {
		super(app, x, y);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void pintar(float _x) {
		app.fill(247,237,240);
		app.ellipse(x+_x,y,20,20);
	}


	@Override
	public void pintar(float nx, float ny) {
		// TODO Auto-generated method stub
		
	}

}
