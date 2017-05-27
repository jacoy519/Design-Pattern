
public class ConcreteElement extends Element {

	@Override
	public void doSomething() {
		System.out.println("concrete element do something");
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
