import java.util.ArrayList;
import java.util.Comparator;

public class CompNum implements Comparator<Elemento> {

	@Override
	public int compare(Elemento a, Elemento b) {
			return (a.getC() - b.getC());
	}
}
