import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import processing.core.PApplet;
import processing.core.PConstants;

public class Logica {

	private PApplet app;
	private Planeta[] p = new Planeta[5];
	private ArrayList<Elemento> elements = new ArrayList<Elemento>();
	private HashSet<Elemento> elementosH;
	private TreeSet<Elemento> elementosT;

	private Planeta select; // para mover los planetas

	private float _x; // para mover la camara

	public Logica(PApplet app) {
		this.app = app;

		// defino los planetas con sus parametros
		p[0] = new PRose(app, 600, 350, 100, _x);
		p[1] = new PKing(app, 912, 109, 100, _x);
		p[2] = new PBusinessMan(app, 125, 117, 100, _x);
		p[3] = new PDrunkard(app, 1060, 580, 100, _x);
		p[4] = new PLightMan(app, 197, 509, 100, _x);

		_x = 0;
		select = null;

	}

	public void display() {

		// -------PINTAR ELEMENTOS
		for (int i = 0; i < elements.size(); i++) {
			elements.get(i).pintar(_x);
		}

		// --- AGREGAR ELEMENTOS
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < elements.size(); j++) {
				Planeta pp = p[i];
				if (select != null && pp.activarAgregar(elements.get(j))) {

					if (p[i].agregar(elements.get(j), elements.get(i).getC())) {
						elements.remove(j);
					}
				}
			}
		}

		// -------PINTAR PLANETAS
		for (int i = 0; i < 5; i++) {
			p[i].pintar(_x);
		}
	}

	public void click() {
		for (int i = 0; i < p.length; i++) {
			if (p[i].activar(app) && select == null) {
				select = p[i];
			}
		}
		
			if (app.mouseButton == PConstants.RIGHT) {
				for (int i = 0; i < p.length; i++) {
					Planeta rose = p[i];
					if(rose instanceof Planeta){
						rose.ordenar();
						System.out.println("asdfasdfdsfasdfas");

					}

				}
			}
		
	}

	public void drag() {
		if (select != null) {
			select.drag(app.mouseX, app.mouseY);
		}
	}

	public void mRelease() {
		select = null;
	}

	public void key() {

		if (app.keyCode == 'A') {
			elements.add(new Flor(app, app.random(0, app.width), app.random(50, app.height)));
		}
		if (app.keyCode == 'S') {
			elements.add(new Star(app, app.random(0, app.width), app.random(50, app.height)));
		}
		if (app.keyCode == 'D') {
			elements.add(new Bottle(app, app.random(0, app.width), app.random(50, app.height)));
		}
		if (app.keyCode == 'F') {
			elements.add(new Number(app, app.random(0, app.width), app.random(50, app.height)));
		}
		if (app.keyCode == 'G') {
			elements.add(new Luz(app, app.random(0, app.width), app.random(50, app.height)));
		}
	}

}
