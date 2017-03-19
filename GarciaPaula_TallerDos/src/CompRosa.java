import java.util.Comparator;

public class CompRosa implements Comparator<Elemento> {

	@Override
	public int compare(Elemento a, Elemento b) {
		// TODO Auto-generated method stub
		return (a.getC() - b.getC());
	}

}
