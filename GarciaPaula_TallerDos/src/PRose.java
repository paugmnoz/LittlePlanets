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
		backup.addAll(newEs);
	}

	public void pintar(float _x) {
		a++;
		app.fill(232, 125, 202);
		app.pushMatrix();
		app.translate(x, y);
		app.rotate((float) (a * 0.001));
		app.image(img[0], 0, 0, iw, iw);
		app.popMatrix();

		// app.ellipse(x + _x, y, 100, 100);
		for (int i = 0; i < newEs.size(); i++) {
			app.pushMatrix();
			app.translate(x, y);
			app.rotate((float) (a * 0.02));
			newEs.get(i).pintar(0, 0, iw / 2 + 20, angulo * i, c);
			angulo = PConstants.TWO_PI / newEs.size();
			app.popMatrix();
		}

		cambios();
		ordenado();
	}

	public void ordenado() {
		if (ordenado) {
			Collections.sort(newEs, new CompRosa());
			for (int i = 0; i < newEs.size(); i++) {
				app.pushMatrix();
				app.translate(x, y);
				app.rotate((float) (a * 0.02));
				newEs.get(i).pintar(0, 0, iw / 2 + 20, angulo * i, c);
				app.ellipse(0 + PApplet.cos(angulo) * radio, 0 + PApplet.sin(angulo) * radio, 20, 20);
				angulo = PConstants.TWO_PI / newEs.size();
				app.popMatrix();

			}
		}
	}

	public void cambios() {
		if (newEs.size() == 5) {
			iw += 2;
		}
	}

	@Override
	public void ordenar() {
		newEs.clear();
		newEs.addAll(backup);
		ordenado = true;
	}

	@Override
	public void variar() {

	}

	@Override
	public boolean agregar(Elemento newE) {
		Elemento e = newE;
		if (e instanceof Flor || e instanceof Star) {
			newEs.add(newE);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int getC() {
		// TODO Auto-generated method stub
		return super.getC();
	}

	public ArrayList<Elemento> getNewEs() {
		return newEs;
	}

}
