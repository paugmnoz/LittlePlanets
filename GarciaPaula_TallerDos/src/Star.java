import processing.core.PApplet;

public class Star extends Elemento {
	private float _nx, _ny;


	public Star (PApplet app, float x, float y) {
		super(app, x, y);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void pintar(float _x) {
		app.fill(98,205,232);
		app.ellipse(x+_x,y,20,20);
	}


	@Override
	public void pintar(float nx, float ny, float radio, float angulo) {
		app.fill(98,205,232);
		_nx = nx + PApplet.cos(angulo) * radio;
		_ny = nx + PApplet.sin(angulo) * radio;
		app.ellipse(_nx,_ny,20,20);		}
}
