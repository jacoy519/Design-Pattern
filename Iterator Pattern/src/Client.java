
public class Client {
	
	public static void main(String[] args) {
		Aggregate<String> aggregate = new ConcreteAggregate<String>();
		
		aggregate.add("test 1");
		aggregate.add("test 2");
		aggregate.add("test 3");
		
		Iterator<String> iter = aggregate.getIterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
