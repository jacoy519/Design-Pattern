
public class ConcreteVisitor implements Visitor {

	@Override
	public void visit(ConcreteElement element) {
		System.out.println("visitor read concrete element");
		element.doSomething();
	}

}
