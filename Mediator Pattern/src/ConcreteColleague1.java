
public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	public void selfMethod() {
		System.out.println("colleague 1 do something");
	}
	
	public void dependMethod() {
		System.out.println("colleague 1 ask do something 2");
		mediator.doSomething2();
	}

}
