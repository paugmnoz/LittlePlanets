import processing.core.PApplet;

public class Flor extends Elemento {


	public Flor(PApplet app, float x, float y) {
		super(app, x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintar(float _x) {
		app.fill(232,125,202);
		app.ellipse(x+_x,y,20,20);		
	}
	
	public void pintar(float nx, float ny) {
		app.fill(232,125,202);
		app.ellipse(nx,ny,20,20);
	}

}
