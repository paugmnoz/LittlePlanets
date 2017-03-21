import java.util.ArrayList;
import java.util.Comparator;

public class CompRosa implements Comparator<Elemento> {

	@Override
	public int compare(Elemento a, Elemento b) {

		if (a instanceof Flor) {
			return (a.getC() - b.getC());
		} else
			return 0;
	}
}
