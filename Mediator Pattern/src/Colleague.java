
public abstract class Colleague {
	
	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
	//自有方法
	public abstract void selfMethod();
	
	//依赖方法
	public abstract void dependMethod();

}
