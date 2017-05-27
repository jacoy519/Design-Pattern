
public class Client {

	public static void main(String[] args) {
		Element el = new ConcreteElement();
		Visitor visitor = new ConcreteVisitor();
		el.accept(visitor);
	}

}
