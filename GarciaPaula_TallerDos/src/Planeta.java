
public abstract class Planeta implements Ordenable {
	protected float x, y;
	protected int escala;

	public Planeta(float x, float y, int escala) {
		this.x = x;
		this.y = y;
		this.escala = escala;
	}

	public abstract void pintar();

	public abstract void ordenar();
	public abstract void variar();
}
