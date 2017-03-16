import java.util.ArrayList;

import processing.core.PApplet;

public class PDrunkard extends Planeta {

	private ArrayList<Elemento> newEs = new ArrayList<Elemento>();

	public PDrunkard(PApplet app, float x, float y, int escala, float _x) {
		super(app, x, y, escala, _x);
	}

	public void pintar(float _x) {
		app.fill(232, 145, 98);
		app.ellipse(x + _x, y, 100, 100);
		for (int i = 0; i < newEs.size(); i++) {
			newEs.get(i).pintar(x + 70, y + 70);
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
	public void agregar(Elemento newE) {
		Elemento e = newE;
		if (e instanceof Bottle) {
			newEs.add(newE);
		} else {

		}
	}
}
