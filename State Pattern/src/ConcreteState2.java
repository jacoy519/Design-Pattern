
public class ConcreteState2 extends State {

	@Override
	public void handler1() {
		System.out.println("state 2 do nothing");
	}

	@Override
	public void handler2() {
		System.out.println("state 2 do something and change state to 1");
		
		//��ת��״̬1
		super.context.setCurrentState(Context.STATE_1);
	}

}
