
public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component component) {
		super(component);
	}
	
	@Override
	public void operate() {
		System.out.println("concrete decorator 2 operate");
		super.operate();
	}

}
