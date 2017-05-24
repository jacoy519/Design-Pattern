
public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	
	public void dependMethod() {
		System.out.println("colleague 2 ask do something 1");
		mediator.doSomething1();
	}
	
	public void selfMethod() {
		System.out.println("colleague 2 do something");
	}

}
