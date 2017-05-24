
public abstract class Colleague {
	
	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
	//���з���
	public abstract void selfMethod();
	
	//��������
	public abstract void dependMethod();

}
