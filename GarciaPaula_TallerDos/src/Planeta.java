import java.util.ArrayList;

import processing.core.PApplet;

public abstract class Planeta implements Ordenable {
	protected float x, y, _x, radio, angulo;
	protected int escala;
	protected PApplet app;

	public Planeta(PApplet app, float x, float y, int escala,float _x) {
		this.app = app;
		this.x = x;
		this.y = y;
		this.escala = escala;
		this._x = _x;
		radio=50;
	}

	public abstract void pintar(float _x);
	
	//metodo para activar drag
	public Boolean activar(PApplet app){
		if (PApplet.dist(x, y, app.mouseX, app.mouseY) < escala) {
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
		if(PApplet.dist(newE.getX(), newE.getY(), x, y)<escala){
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
}
