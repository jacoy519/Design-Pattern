
public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Component component) {
		super(component);
	}
	
	@Override
	public void operate() {
		System.out.println("concrete decorator 1 operate");
		super.operate();
	}

}
