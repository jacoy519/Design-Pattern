
public class Context {
	
	//定义状态
	public final static ConcreteState1 STATE_1 = new ConcreteState1();
	public final static ConcreteState2 STATE_2 = new ConcreteState2();
	
	//当前状态
	private State state = null;
	
	//设置当前状态
	public void setCurrentState(State state) {
		this.state = state;
		
		//状态切换
		this.state.setContext(this);
	}
	
	//行为委托
	public void handler1() {
		this.state.handler1();
	}
	
	public void handler2() {
		this.state.handler2();
	}
}
