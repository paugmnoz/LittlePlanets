
public abstract class Planeta {
	protected float x, y;
	protected int escala;

	public Planeta(float x, float y, int escala) {
		this.x = x;
		this.y = y;
		this.escala =  escala;
	}
	
	public abstract void pintar();

}
