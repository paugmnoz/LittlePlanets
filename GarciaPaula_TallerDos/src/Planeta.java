import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PImage;

public abstract class Planeta implements Ordenable {
	protected float x, y, _x, radio, angulo;
	protected float iw, ih; // para cambiar el tamaño del a imagen de los planetas
	protected int escala, c;
	protected PApplet app;
	protected PImage[] img = new PImage [5];
	protected double a;
	protected boolean ordenado;

	public Planeta(PApplet app, float x, float y, int escala,float _x) {
		this.app = app;
		this.x = x;
		this.y = y;
		this.escala = escala;
		this._x = _x;
		radio=50;
		a= 0;
		for (int i = 0; i < img.length; i++) {
			img[i] = app.loadImage("../data/Planeta"+i+".png"); 
			iw = img[i].width / 2 + 60;
		}
		
		app.imageMode(PConstants.CENTER);
		ordenado = false;
	}

	public abstract void pintar(float _x);
	
	//metodo para activar drag
	public Boolean activar(PApplet app){
		if (PApplet.dist(x, y, app.mouseX, app.mouseY) < iw) {
			return true;
		}
		return false;
	}
	
	//nueva posicion
	public void drag(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	//para activar agregar color
	public boolean activarAgregar(Elemento newE){
		if(PApplet.dist(newE.getX(), newE.getY(), x, y)<iw){
			return true;
		}
		return false;
	}
	
	// para saber si agrego el elemento al planeta
	public abstract boolean agregar(Elemento newE);
	
	public abstract void ordenar();
	public abstract void variar();
	
	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}
	public int getC() { //obtener qué numero de imagen tiene el elemento
		return c;
	}

}
