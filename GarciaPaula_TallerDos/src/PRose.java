import java.util.ArrayList;
import java.util.Collections;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public class PRose extends Planeta {

	private ArrayList<Elemento> newEs = new ArrayList<Elemento>();
	private ArrayList<Elemento> backup = new ArrayList<Elemento>();

	public PRose(PApplet app, float x, float y, int escala, float _x) {
		super(app, x, y, escala, _x);
	}

	public void pintar(float _x) {
		a++;
		app.fill(232, 125, 202);
		app.pushMatrix();
		app.translate(x, y);
		app.rotate((float) (a * 0.001));
		app.image(img[0], 0, 0, iw, iw);
		app.popMatrix();
		System.out.println(order);
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
	public void ordenar() {
		Collections.sort(newEs, new CompNum());
	}

	@Override
	public void variar() {
	}

	@Override
	public boolean agregar(Elemento newE, int c) {
		Elemento e = newE;
		if (e instanceof Flor || e instanceof Star) {
			newEs.add(newE);
			order = c;
			return true;
		} else {
			return false;
		}
	}

	public ArrayList<Elemento> getNewEs() {
		return newEs;
	}

}
