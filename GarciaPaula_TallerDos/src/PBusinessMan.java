import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PConstants;

public class PBusinessMan extends Planeta {
	private ArrayList<Elemento> newEs = new ArrayList<Elemento>();

	public PBusinessMan(PApplet app, float x, float y, int escala, float _x) {
		super(app, x, y, escala, _x);

	}

	public void pintar(float _x) {
		app.fill(247, 237, 240);
		app.ellipse(x + _x, y, 100, 100);
		for (int i = 0; i < newEs.size(); i++) {
			app.pushMatrix();
			app.translate(x, y);
			app.rotate((float) (0 * 0.05));
			newEs.get(i).pintar(0, 0, radio, angulo * i);
			angulo = PConstants.TWO_PI / newEs.size();
			app.popMatrix();
		}
	}

	@Override
	public void variar() {
	}

	@Override
	public void ordenar() {
	}

	@Override
	public boolean agregar(Elemento newE) {
		Elemento e = newE;
		if (e instanceof Number || e instanceof Bottle) {
			newEs.add(newE);
			return true;
		} else {
return false;
		}
	}

}
