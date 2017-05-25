import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {
	
	private List<T> arrayList = new ArrayList<T>();
	
	@Override
	public void add(T obj) {
		arrayList.add(obj);
	}

	@Override
	public void remove(T obj) {
		arrayList.remove(obj);
	}

	@Override
	public Iterator<T> getIterator() {
		return new ConcreteIterator<T>(this);
	}

	@Override
	public int getSize() {
		return arrayList.size();
	}

	@Override
	public T get(int index) {
	
		return arrayList.get(index);
	}

	@Override
	public void remove(int index) {
		arrayList.remove(index);
	}

}
