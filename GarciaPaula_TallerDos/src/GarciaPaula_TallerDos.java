import processing.core.PApplet;

public class GarciaPaula_TallerDos extends PApplet {

	private Logica app;

	public static void main(String[] args) {
		PApplet.main("GarciaPaula_TallerDos");
	}

	@Override
	public void settings() {
		size(1200, 700);
	}

	@Override
	public void setup() {
		app = new Logica(this);
	}

	@Override
	public void draw() {
		background(255);
		noStroke();
		app.display();
	}

	@Override
	public void mousePressed() {
		app.click();
	}

	@Override
	public void mouseReleased() {
		app.mRelease();
	}
	
	@Override
	public void mouseDragged() {
		app.drag();
	}

	@Override
	public void keyReleased() {
		app.key();
	}
}
