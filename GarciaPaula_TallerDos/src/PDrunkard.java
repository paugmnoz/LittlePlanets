import processing.core.PApplet;

public class PDrunkard extends Planeta {

	public PDrunkard (PApplet app, float x, float y, int escala,float _x) {
		super(app, x, y, escala, _x);
	}
	public void pintar (float _x) {
		app.fill(232,145,98);
		app.ellipse(x+_x,y,100,100);
	}
	@Override
	public void variar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ordenar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void agregar(Elemento newE) {
		// TODO Auto-generated method stub
		
	}
}
