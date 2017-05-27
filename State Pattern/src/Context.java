
public class Context {
	
	//����״̬
	public final static ConcreteState1 STATE_1 = new ConcreteState1();
	public final static ConcreteState2 STATE_2 = new ConcreteState2();
	
	//��ǰ״̬
	private State state = null;
	
	//���õ�ǰ״̬
	public void setCurrentState(State state) {
		this.state = state;
		
		//״̬�л�
		this.state.setContext(this);
	}
	
	//��Ϊί��
	public void handler1() {
		this.state.handler1();
	}
	
	public void handler2() {
		this.state.handler2();
	}
}
