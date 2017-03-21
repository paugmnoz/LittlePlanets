import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PConstants;

public class PKing extends Planeta {

	private ArrayList<Elemento> newEs = new ArrayList<Elemento>();

	public PKing(PApplet app, float x, float y, int escala, float _x) {
		super(app, x, y, escala, _x);
		iw = iw +10;

	}

	public void pintar(float _x) {
		a++;
		app.fill(98, 205, 232);
		app.pushMatrix();
		app.translate(x, y);
		app.rotate((float) (a * 0.001));
		app.image(img[2], 0, 0, iw, iw);
		app.popMatrix();
		
		for (int i = 0; i < newEs.size(); i++) {
			app.pushMatrix();
			app.translate(x, y);
			app.rotate((float) (a * 0.05));
			newEs.get(i).pintar(0, 0, iw/2 + 20, angulo * i,0);
			angulo = PConstants.TWO_PI / newEs.size();
			app.popMatrix();
		}
		cambios();
	}
	
	public void cambios(){
		if (newEs.size()==5) {
			iw+=2;
		}
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
	public boolean agregar(Elemento newE, int c) {
		Elemento e = newE;
		if (e instanceof Star || e instanceof Flor) {
			newEs.add(newE);
			return true;
		} else {
return false;
		}
	}
}
