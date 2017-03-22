import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import processing.core.PApplet;
import processing.core.PConstants;

public class PKing extends Planeta {

	private TreeSet<Elemento> backup = new TreeSet<Elemento>();
	private ArrayList<Elemento> newEs = new ArrayList<Elemento>();

	public PKing(PApplet app, float x, float y, int escala, float _x) {
		super(app, x, y, escala, _x);
		iw = iw + 10;

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
			app.rotate((float) (a * 0.02));
			newEs.get(i).pintar(0, 0, iw / 2 + 20, angulo * i, order);
			angulo = PConstants.TWO_PI / newEs.size();
			app.popMatrix();
		}
		cambios();
	}


	public void cambios() {
		if (newEs.size() == 5) {
			iw += 2;
		}
	}

	@Override
	public void variar() {

	}

	@Override
	public void ordenar() {
		Collections.sort(newEs, new CompNum());
	}

	@Override
	public boolean agregar(Elemento newE, int c) {
		Elemento e = newE;
		if (e instanceof Star || e instanceof Flor) {
			newEs.add(newE);
			order = c;
			return true;
		} else {
			return false;
		}
	}
}
