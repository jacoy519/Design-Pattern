
public class ConcreteIterator<T> implements Iterator<T> {
	
	private Aggregate<T> aggregate = null;
	
	private int cursor = 0;
	
	public ConcreteIterator(Aggregate<T> aggregate) {
		this.aggregate = aggregate;
	}
	
	@Override
	public T next() {
		if(hasNext()) {
			return aggregate.get(cursor++);
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		return cursor >= aggregate.getSize() ? false : true;
	}

	@Override
	public boolean remove() {
		aggregate.remove(cursor);
		return true;
	}

}
