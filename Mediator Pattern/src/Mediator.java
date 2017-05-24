
public abstract class Mediator {
	
	protected Colleague c1;
	
	protected Colleague c2;
	
	public void setColleague1(Colleague c1) {
		this.c1 = c1;
	}
	
	public void setColleague2(Colleague c2) {
		this.c2 = c2;
	}
	
	public abstract void doSomething1();
	
	public abstract void doSomething2();
}
