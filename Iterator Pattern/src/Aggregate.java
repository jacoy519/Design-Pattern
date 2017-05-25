
public interface Aggregate<T> {
	
	public void add(T obj);
	
	public void remove(T obj);
	
	public void remove(int index);
	
	public T get(int index);
	
	public int getSize();
	
	public Iterator<T> getIterator();
}
