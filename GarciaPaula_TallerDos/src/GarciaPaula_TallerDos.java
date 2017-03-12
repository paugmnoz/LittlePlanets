import processing.core.PApplet;

public class GarciaPaula_TallerDos extends PApplet {

	private Logica app;

	public static void main(String[] args) {
		PApplet.main("GarciaPaula_TallerDos");
	}

	@Override
	public void settings() {
		size(900, 900);
	}

	@Override
	public void setup() {
		app = new Logica(this);
	}

	@Override
	public void draw() {
		app.display();
	}

	@Override
	public void mouseClicked() {
		app.click();
	}

	@Override
	public void mouseReleased() {
		app.mRelease();
	}

	@Override
	public void keyReleased() {
		app.key();
	}
}
